package operator;

public class OperatorEx2 {

	public static void main(String[] args) {

		int score = 100;
		System.out.println(++score);
		System.out.println(score++);
		System.out.println(score);
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10);
		
		System.out.println(num1);
		System.out.println(i);		//value의 계산식에서 앞의 값이 false 이므로 뒤의 연산이 진행되지 않는다.
		System.out.println(value);
		
		int num2 = 10;
		int num3 = 20;
		int samhang = (num2 > num3)? num2: num3;
		System.out.println(samhang);
	}

}
