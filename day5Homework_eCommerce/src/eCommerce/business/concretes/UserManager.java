package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.EmailService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailService emailService;
	

	public UserManager(UserDao userDao, EmailService emailService) {  //dışarıdan gönderilen db nesnesi için içeride tanımlanan değişkene tanımlayıp kullanıyoruz
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	
	@Override
	public void add(User user) {
		
		userDao.add(user);
		
	}

	@Override
	public void add(String email) {  //only email login
		
		User user = new User();
		user.setEmail(email);
		userDao.add(user);
		System.out.println("Log in : " + user.getEmail());
		emailService.send(email, "Your registration is successful");
	
	}

	@Override
	public void update(User user) {
		
		if(userValidate(user)) { 
			userDao.update(user);
		}
		
	}

	@Override
	public void delete(int userId) {
		
		userDao.delete(userId);
		
	}

	@Override
	public User get(String email) {
		
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	
	public boolean userValidate(User user) {
		
		if(user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}else {
			System.out.println("Your name and surname must be a minimum of 2 characters.");
			return false;
		}
	}
	
	

}
