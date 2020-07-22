package template;

public class SuperLevel extends PlayerLevel{
	
	@Override
	public void run() {

		System.out.println("매우 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump합니다.");		
	}

	@Override
	public void turn() {
		System.out.println("turn합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급차");
	}
}
