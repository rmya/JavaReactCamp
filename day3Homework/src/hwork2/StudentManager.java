package hwork2;

public class StudentManager extends UserManager{

	public void studentInfo(Student student) {
		
		System.out.println("Öğrenci bilgileri : "+ student.getStudentNo() +" "+ student.getStudentDepartment()+" "+student.getUniversity());
		
	}
}
