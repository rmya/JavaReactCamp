package hwork1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category category1 = new Category(1, "Tümü");
		Category category2 = new Category(2 , "Programlama Kursları");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.selectCategory(category1);
		categoryManager.selectCategory(category2);

		
		Courses course1 = new Courses(1,"C# Angular","Lorem ipsum dolor sit amet, consectetur adipiscing elit","Engin Demirog",0);
		Courses course2 = new Courses(2, "Java React","Lorem ipsum dolor sit amet, consectetur adipiscing elit","Engin Demirog",0);
		Courses course3 = new Courses(3,"Programlamaya Giriş İçin Temel Kurs","Lorem ipsum dolor sit amet, consectetur adipiscing elit","Engin Demirog",0);
	
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course3);
		courseManager.addCourse(course1);
		courseManager.updateCourse(course2);
		
		Courses course[] = {course1,course2,course3};
		
		for(int i=0; i<course.length; i++) {
			
			System.out.println(course[i].id + " Kurs Adı : " + course[i].courseName);
			System.out.println(course[i].courseDetail + " Egitmen : " + course[i].courseInstructor);
			System.out.println("Ücret : " + course[i].coursePrice);
		}
	
	
	
	}

}
