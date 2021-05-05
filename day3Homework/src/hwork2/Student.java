package hwork2;

public class Student extends User{
	

	private String studentDepartment;
	private String studentNo;
	private String university;
	

	public Student() {
		
	}
	
	public Student(int id,String firstName,String lastName,String studentDepartment, String studentNo, String university) {
		super(id,firstName,lastName);
		this.studentDepartment = studentDepartment;
		this.studentNo = studentNo;
		this.university = university;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	



	

}
