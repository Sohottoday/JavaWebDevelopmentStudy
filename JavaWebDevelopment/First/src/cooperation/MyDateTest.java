package cooperation;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate md1 = new MyDate(30, 2, 2020);
		System.out.println(md1.isValid());
		
		MyDate md2 = new MyDate(30, 6, 2019);
		System.out.println(md2.isValid());
		
	}

}
