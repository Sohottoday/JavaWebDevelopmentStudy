package interfaceex;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNetCall() {
		System.out.println("������� ���� ���� call�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����մϴ�.");
	}

	
}
