package operator;

public class OperatorEx1 {

	public static void main(String[] args) {

		int num1 = -10;
		int num2 = 20;
		System.out.println(+num1);
		System.out.println(+num2);
		
		System.out.println(-num1);
		System.out.println(-num2);		//부호가 바뀐다.
		
		int num = 5 % 3;
		System.out.println(num);
		
		int num3 = 10;
		num3 += 2;
		System.out.println(num3);
	}

}
