package array;

public class StudentTest {

	public static void main(String[] args) {

		Student stdLee = new Student(1001, "Lee");
		
		stdLee.addSubject("����", 100);
		stdLee.addSubject("����", 90);
		
		Student stdKim = new Student(1002, "Kim");
		stdKim.addSubject("����", 80);
		stdKim.addSubject("����",  70);
		stdKim.addSubject("����",  80);
		
		stdLee.showStudentInfo();
		stdKim.showStudentInfo();
		
	}

}
