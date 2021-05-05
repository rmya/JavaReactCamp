package hwork1;

public class CourseManager {

	public void addCourse(Courses courses) {
		
		System.out.println("Yeni kurs eklendi : " + courses.courseName);
		
	}
	
	public void deleteCourse(Courses courses) {
		
		System.out.println("Seçilen kurs silindi : " + courses.courseName);
		
	}
	
	public void updateCourse(Courses courses) {
		
		System.out.println("Seçilen kurs güncellendi : " + courses.courseName);
		
	}
}
