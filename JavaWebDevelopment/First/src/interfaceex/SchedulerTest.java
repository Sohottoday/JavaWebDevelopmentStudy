package interfaceex;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("��ȭ ���� �Ҵ� ����� �����Ͻÿ�");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� �� �켱 ���õ� ���� ����");
		
		int ch = System.in.read();
		Scheduler sche = null;
		
		if(ch == 'R' || ch == 'r') {
			sche = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			sche = new Leastjob();
		} else if(ch == 'P' || ch == 'p') {
			sche = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		sche.getNetCall();
		sche.sendCallToAgent();
	}

}
