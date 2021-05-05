package hwork2;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı sisteme eklendi.");
	}
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() +" " + user.getLastName() + "kullanıcı kaydı silindi.");
	}

	
}
