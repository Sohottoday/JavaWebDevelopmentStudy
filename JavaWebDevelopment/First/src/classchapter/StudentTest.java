package classchapter;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student("James");
		//studentJames.studentName = "¸£ºê·Ð Á¦ÀÓ½º";
		studentJames.address = "LA";
		
		studentJames.showStudentInfo();
		
		Student studentKim = new Student(100, "±è±è±è");
		//studentKim.studentName = "±è±è±è";
		studentKim.address = "¼­¿ï";
		
		studentKim.showStudentInfo();
		
		
	}

}
