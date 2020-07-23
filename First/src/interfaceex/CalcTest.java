package interfaceex;

public class CalcTest {

	public static void main(String[] args) {

		CompleteCalc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		calc.showInfo();
		
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);		// static 으로 선언했으므로 인스턴스 객체가 아닌 클래스 자체로 사용
		System.out.println(sum);
	}

}
