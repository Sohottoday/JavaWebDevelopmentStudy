package array;

public class StudentTest {

	public static void main(String[] args) {

		Student stdLee = new Student(1001, "Lee");
		
		stdLee.addSubject("국어", 100);
		stdLee.addSubject("수학", 90);
		
		Student stdKim = new Student(1002, "Kim");
		stdKim.addSubject("국어", 80);
		stdKim.addSubject("수학",  70);
		stdKim.addSubject("영어",  80);
		
		stdLee.showStudentInfo();
		stdKim.showStudentInfo();
		
	}

}
