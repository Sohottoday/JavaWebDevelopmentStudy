package innerclass;


class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {		// �ν��Ͻ� �̳�Ŭ����
		int iNum = 100;
		//static int sInNum = 200;			// �ν��Ͻ� �̳�Ŭ�������� ��쿡�� outclass ���� ���Ŀ� ������ �ǹǷ� static ������ �ȿ��� ����� �� ����.
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	
	public void usingInner() {
		inClass.inTest();		// outclass.~~ �ϸ� private���� ���� ����� �Ӽ��� �� �����Ƿ� ����� �� �ֵ��� ������ �ش�.
	}
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println();
			System.out.println(sNum);
		}
		
		static void sTest() {		// static Ŭ���� �ȿ����� static ����, static �޼��� ��� ���� �����ϴ�.
			//System.out.println(inNum);		//static�� ������ ������� �θ� �� �ִ� �޼����̹Ƿ� static Ŭ���� ���� ������ ����� �� ����.
			System.out.println();
			System.out.println(sNum);
		}
	}
}



public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
	}

}