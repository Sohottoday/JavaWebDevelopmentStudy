package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();		// 함수의 구현부가 변수처럼 작용
		test.showString("good java");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("haha");
	}
	
	public static PrintString returnString() {		//PrintString 타입으로 받음
		return s -> System.out.println(s + "~~!!!");		
	}

}
