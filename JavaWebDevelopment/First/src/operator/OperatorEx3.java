package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int num1 = 0B00001010;	// 10
		int num2 = 0B00000101;	// 5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(num2 << 1);		//2������ ��ĭ�� �з��� 0B00001010 �� ��
		System.out.println(num2 << 3);		//2������ ��ĭ�� �з��� 0B00101000 �� ��
		
	}

}
