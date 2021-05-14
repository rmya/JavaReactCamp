package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utils.Utils;
import eCommerce.entities.Dtos.LoginDto;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserService userService;
	

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public boolean userValidate(User user) {
		
		if(user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}else {
			System.out.println("All fields must be required!");
			return false;
		}
				
	}
	
	public boolean passwordValidate(String password) {
		
		int passwordDigit = 6;
		
		if(password.length() >= passwordDigit) {
			return true;
		}else {
			System.out.println("Password cannot be shorter than "+ passwordDigit + " characters.");
			return false;
		}
	}

	@Override
	public void register(User user) {
		
		if(userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {
			
			userService.add(user);
			
		}else {
			System.out.println("Your registration is failed");
		}
		
	}

	@Override
	public void verify(User user, String token) {
		
		if(user != null && token.length() > 20) {
			User existUser = userService.get(user.getEmail());
			existUser.setVerify(true);
			
			userService.update(existUser);
			
			System.out.println("Your email has been verified");
		}else {
			System.out.println("Your email could not be verified !");
		}
		
	}

	@Override
	public boolean userExists(String email) {
		
		User user = userService.get(email);
		
		if(user == null) {
			return false;
		}else {
			System.out.println("Your email already exists" + email);
			return true;
		}

	}

	@Override
	public void Login(LoginDto dto) {
		
		User user = userService.get(dto.getEmail());
		
		if(user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Successfully logged in");

		}else {
			System.out.println("Your sername or password is wrong");
			
		}
		
	}
	
	

}
