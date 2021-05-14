package eCommerce.core.utils;

import eCommerce.business.abstracts.UserService;
import eCommerce.entities.Dtos.LoginDto;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{
	
	private UserService userService;
	

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public boolean userExists(String email) {
		
		if(userService.get(email) != null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	@Override
	public void register(String email) {
		
		if(userExists(email) == false) {
			userService.add(email);
		}else {
			
			User user= userService.get(email);
			
			LoginDto dto = new LoginDto();
			dto.setEmail(user.getEmail());
			dto.setPassword(user.getPassword());
			
			login(dto);
		}
		
	}



	@Override
	public void login(LoginDto dto) {
		
		if(dto != null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Login is successful");
		}else {
			System.out.println("User or password is incorrect");
		}
		
	}

}
