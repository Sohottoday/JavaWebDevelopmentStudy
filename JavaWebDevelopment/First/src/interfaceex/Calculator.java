package interfaceex;

public abstract class Calculator implements Calc{		// ���� ������ ���� �ƴϹǷ� abstract ��, �߻�Ŭ������ �ȴ�.

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}


	
}
