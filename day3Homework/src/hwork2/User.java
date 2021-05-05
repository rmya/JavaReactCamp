package hwork2;

public class User {
	
	private int id;
	//private String password;
	//private String email;
	private String firstName;
	private String lastName;
	
	
	
	public User(){
		
	}


	public User(int id, String firstName, String lastName) {
		this.id = id;
		//this.password = password;
		//this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

/*
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

*/
	public String getFirstName() {
		return firstName;
	}


	public void setFirsName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	




	
	
	
	
	

}
