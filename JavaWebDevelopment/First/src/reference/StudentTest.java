package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student std = new Student(100, "Lee");
		std.setKoreaSubject("����", 100);
		std.setMathSubject("����", 95);
		
		Student std2 = new Student(101, "Kim");
		std2.setKoreaSubject("����", 70);
		std2.setMathSubject("����", 85);

		std.showStudentScore();
		std2.showStudentScore();
		
	}

}
