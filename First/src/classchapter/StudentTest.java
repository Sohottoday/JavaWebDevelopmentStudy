package classchapter;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student("James");
		//studentJames.studentName = "����� ���ӽ�";
		studentJames.address = "LA";
		
		studentJames.showStudentInfo();
		
		Student studentKim = new Student(100, "����");
		//studentKim.studentName = "����";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		
	}

}
