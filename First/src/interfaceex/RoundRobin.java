package interfaceex;

public class RoundRobin implements Scheduler{

	@Override
	public void getNetCall() {
		System.out.println("��� ��ȭ�� ������ ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
	}

	
}
