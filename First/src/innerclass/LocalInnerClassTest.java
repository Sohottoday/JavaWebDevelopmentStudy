package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;		// 지역변수는 메서드가 호출되어 끝날때까지만 유효하다
		class MyRunnable implements Runnable {

			@Override
			public void run() {			// 메서드는 클래스가 호출되지 않아도 사용할 수 있다.
				
				//num += 10;			// 따라서 지역변수를 사용할 수 없다.
				//i = 200;
				System.out.println(outNum);
				System.out.println(Outer.sNum);			// 정적 변수 사용 가능
				System.out.println(num);
				System.out.println(i);
			}
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerClassTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
