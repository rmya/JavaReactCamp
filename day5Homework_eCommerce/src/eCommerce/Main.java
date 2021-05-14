package eCommerce;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.GoogleEmailManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.utils.GoogleEmailManagerAdapter;
import eCommerce.dataAccess.concretes.inMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		
		User user1 = new User(1,"Rumeysa","Tan","rumeysa@gmail.com","1234567",true);
		User user2 = new User(2,"Merve","Ay","ayay@gmail.com","1234",true);   //wrong password for test
		User user3 = new User(3,"Seda","Yıldız","yıııldıza@gmail.com","1234567",true);  //wrong email for test
		
		inMemoryUserDao inMemoryUserDao = new inMemoryUserDao();
		GoogleEmailManagerAdapter googleEmailManagerAdapter = new GoogleEmailManagerAdapter(new GoogleEmailManager());
		
		AuthManager authManager = new AuthManager(new UserManager(inMemoryUserDao, googleEmailManagerAdapter));
		
		authManager.register(user1);
		authManager.register(user2);
		authManager.register(user3);
		UserManager userManager = new UserManager(inMemoryUserDao,googleEmailManagerAdapter);
		userManager.getAll();
	}

}

/*
 * Result;
 * 		rumeysa@gmail.com : true
		Added : Rumeysa Tan
		Password cannot be shorter than 6 characters.
		Your registration is failed
		yıııldıza@gmail.com : false
		Your registration is failed
 * 
 */
