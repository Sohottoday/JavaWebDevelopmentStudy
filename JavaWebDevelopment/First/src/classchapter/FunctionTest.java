package classchapter;

public class FunctionTest {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {		// return값이 없기 때문에 void 사용
		System.out.println(greeting);
	}
	
	public static int calcSum() {		// 매개변수가 없는 경우
		int sum = 0;
		int i;
		for(i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}		
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		sayHello("반갑습니당");		// void로 선언되어 있으므로 받을 수 없다. String say = sayHello() 불가
		
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
	}

}
