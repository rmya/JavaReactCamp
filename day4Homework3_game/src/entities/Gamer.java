package entities;

import abstracts.Entity;

public class Gamer implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentityId;
	private int bithdate;
	
	
	public Gamer(int id, String firstName, String lastName, String nationalIdentityId, int bithdate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentityId = nationalIdentityId;
		this.bithdate = bithdate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalIdentityId() {
		return nationalIdentityId;
	}


	public void setNationalIdentityId(String nationalIdentityId) {
		this.nationalIdentityId = nationalIdentityId;
	}


	public int getBithdate() {
		return bithdate;
	}


	public void setBithdate(int bithdate) {
		this.bithdate = bithdate;
	}
	
	
	

}
