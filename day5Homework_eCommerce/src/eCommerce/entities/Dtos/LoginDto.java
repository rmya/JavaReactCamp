package eCommerce.entities.Dtos;


public class LoginDto implements Dto {
	
	private String email;
	private String password;
	
	public LoginDto() {
		super();
	}

	public LoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
