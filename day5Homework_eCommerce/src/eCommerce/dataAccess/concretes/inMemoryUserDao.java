package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class inMemoryUserDao implements UserDao {
	
	private List <User> users = new ArrayList<User>();  //db
	
	public inMemoryUserDao() {
		
		User user1 = new User(1,"Rumeysa","Tan","rmya@gmail.com","123456",true);
		User user2 = new User(1,"Ruken","Gül","rskn@gmail.com","123456",true);
		User user3 = new User(1,"Kübra","Çiçek","kubra@gmail.com","123456",true);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}
	

	@Override
	public void add(User user) {

		users.add(user);
		System.out.println("Added : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		
		User userToUpdate = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		userToUpdate.setVerify(user.isVerify());
		
	}

	@Override
	public void delete(int userId) {
		
		User userToDelete = users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
		
		users.remove(userToDelete);
		
	}

	@Override
	public User get(String email) {
		
		User user = users.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
		
		return user;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}
	

}
