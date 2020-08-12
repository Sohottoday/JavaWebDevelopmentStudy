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
		
		System.out.println("나이 : " + person.age);
		System.out.println("이름 : " + person.name);
		System.out.println("결혼여부 : " + person.married);
		System.out.println("자녀수 : " + person.children);
				
	}
}
