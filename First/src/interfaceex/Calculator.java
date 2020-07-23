package interfaceex;

public abstract class Calculator implements Calc{		// 전부 구현한 것이 아니므로 abstract 즉, 추상클래스가 된다.

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}


	
}
