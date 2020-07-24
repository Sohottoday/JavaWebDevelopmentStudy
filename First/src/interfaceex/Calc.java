package interfaceex;

public interface Calc {

	double PI = 3.14;
    int ERROR = -999999999;			// �������̽����� ������ ������ ������ �������� ���(final)�� ��ȯ��

	int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);		//�������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��
    
	default void description() {
		System.out.println("���� ����Դϴ�.");
		myMethod();		// �Ʒ����� private void���� ������ �޼���
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
	
	private static void mystaticMethod() {			//static �޼��忡�� �Ϲ� �޼��带 ȣ���� ���� ����.
		System.out.println("private static method");
	}
    
}