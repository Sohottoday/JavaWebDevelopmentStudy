package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();		// �Լ��� �����ΰ� ����ó�� �ۿ�
		test.showString("good java");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("haha");
	}
	
	public static PrintString returnString() {		//PrintString Ÿ������ ����
		return s -> System.out.println(s + "~~!!!");		
	}

}