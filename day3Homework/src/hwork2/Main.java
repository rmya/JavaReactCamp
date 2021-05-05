package hwork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(1,"Rumeysa","Tan","Bilgisayar Mühendisi","2020202","DPÜ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.studentInfo(student);
		
		
		
		Instructor inst = new Instructor(1,"Engin","Demiroğ","Instructor & Consultant & Lifetime learner");
		
		InstructorManager instManage = new InstructorManager();
		instManage.instructorInfo(inst);
		
		UserManager userManager = new UserManager();
		userManager.add(inst);
		userManager.add(student);
		
	}

}
