package classchapter;

public class Student {		// public Ŭ������ ���ϸ��� �̸��� ���ƾ� �ϰ� �� ���Ͽ� �� �ϳ��� �� �� �ִ�.

	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {		// ������
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public void showStudentInfo() {		 // return���� ���� �� void�� ����Ѵ�.
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}