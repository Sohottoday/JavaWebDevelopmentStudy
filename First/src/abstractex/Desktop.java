package abstractex;

public class Desktop extends Computer{		// �ϳ��� �߻�޼���� ������ �ϸ� abstract�� �Ǿ� �Ѵ�.
	// �θ� Ŭ�������� ���۵� �߻� �޼��尡 �������� �� ���� �������� �ʰ� ��� �����Ѵٸ� abstract Ŭ������ �Ǿ�� �Ѵ�.
	// ��� �߻� �޼��带 ������ �� �Ϲ� Ŭ������ �Ǿ� abstract�� ���� �ʴ´�.

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
