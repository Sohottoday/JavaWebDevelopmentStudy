package classchapter;

public class Student {		// public 클래스는 파일명과 이름이 같아야 하고 한 파일에 단 하나만 들어갈 수 있다.

	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {		// 생성자
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() {		 // return값이 없을 때 void를 사용한다.
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}
