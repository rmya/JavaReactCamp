package hwork2;

public class InstructorManager extends UserManager{

	public void instructorInfo(Instructor inst) {
		
		System.out.println("Eğitmen hakkında : " + inst.getFirstName() +" "+ inst.getLastName() +" "+ inst.getProfession());
	}
	
	
}
