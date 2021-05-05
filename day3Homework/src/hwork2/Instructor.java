package hwork2;

public class Instructor extends User {
	
	private String profession;
	private String[] ownedCourse;
	
	public Instructor() {
		
	}

	public Instructor(int id,String firstName,String lastName,String profession) {
		super(id,firstName,lastName);
		this.profession = profession;
		//this.ownedCourse = ownedCourse;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String[] getOwnedCourse() {
		return ownedCourse;
	}

	public void setOwnedCourse(String[] ownedCourse) {
		this.ownedCourse = ownedCourse;
	}


	
	
	
	

}
