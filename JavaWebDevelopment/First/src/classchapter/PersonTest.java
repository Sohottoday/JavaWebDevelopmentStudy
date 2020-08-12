package classchapter;

public class PersonTest {

	public static void main(String[] args) {

		Person noname = new Person();
		noname.showInfo();
		
		Person lee = new Person("Lee", 20);
		lee.showInfo();
		System.out.println(lee);
		
		Person p = lee.getSelf();
		System.out.println(p);
	}

}
