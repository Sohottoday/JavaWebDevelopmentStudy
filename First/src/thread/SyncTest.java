package thread;

class Bank{
	private int money = 10000;
	
	public void saveMoney(int save) {
		synchronized(this) {				// 이러한 방식으로 synchronized block 방식 사용 가능, 좀 더 섬세하게 범위 지정이 가능하다.
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
	}
	
//	public synchronized void saveMoney(int save) {
//		int m = this.getMoney();
//		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		setMoney(m + save);
//	}	
	
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money : " + SyncTest.myBank.getMoney());
	}
	
}

class ParkWife extends Thread{

	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus money : " + SyncTest.myBank.getMoney());
	}
}


public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {

		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();				// synchronized 를 사용하지 않으면 run이 동시에 되므로 save가 되기 전에 minus가 발생한다(딜레이 지정해둔 시간으로 인해)
	}

}
