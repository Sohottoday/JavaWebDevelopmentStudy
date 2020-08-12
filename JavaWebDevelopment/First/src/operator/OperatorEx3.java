package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int num1 = 0B00001010;	// 10
		int num2 = 0B00000101;	// 5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(num2 << 1);		//2진수가 한칸씩 밀려서 0B00001010 이 됨
		System.out.println(num2 << 3);		//2진수가 세칸씩 밀려서 0B00101000 이 됨
		
	}

}
