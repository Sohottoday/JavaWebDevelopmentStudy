package interfaceex;

public interface Calc {

	double PI = 3.14;
    int ERROR = -999999999;			// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수(final)로 변환됨

	int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);		//인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
    
	default void description() {
		System.out.println("정수 계산입니다.");
		myMethod();		// 아래에서 private void으로 선언한 메서드
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		mystaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {			//static 메서드에서 일반 메서드를 호출할 수는 없다.
		System.out.println("private static method");
	}
    
}
