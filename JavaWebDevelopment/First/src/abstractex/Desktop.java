package abstractex;

public class Desktop extends Computer{		// 하나의 추상메서드라도 포함을 하면 abstract가 되야 한다.
	// 부모 클래스에서 시작된 추상 메서드가 여러개일 때 전부 구현하지 않고 몇개만 구현한다면 abstract 클래스가 되어야 한다.
	// 모든 추상 메서드를 구현할 때 일반 클래스가 되어 abstract를 쓰지 않는다.

	public void display() {
		System.out.println("Desktop displya");
	}
	
	public void typing() {
		System.out.println("Desktop typing");
	}
	
	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}
}
