package classchapter;

public class ObjectLab1 {
	int age;
	String name;
	boolean married;
	int children;
	
	public static void main(String[] args) {
		ObjectLab1 person = new ObjectLab1();
		person.age = 40;
		person.name = "James";
		person.married = true;
		person.children = 3;
		
		System.out.println("���� : " + person.age);
		System.out.println("�̸� : " + person.name);
		System.out.println("��ȥ���� : " + person.married);
		System.out.println("�ڳ�� : " + person.children);
				
	}
}
