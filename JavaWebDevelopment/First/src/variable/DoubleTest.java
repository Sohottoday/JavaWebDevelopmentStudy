package variable;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14f;		//float�� 4byteũ�� �̹Ƿ� �ܼ��ϰ� 3.14�� ���´ٸ� double���� �ǹǷ� ������ �߻��Ѵ�.
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		double ddNum = 1;
		for(int i=0; i<10000; i++) {
			ddNum = ddNum + 0.1;
		}
		System.out.println(ddNum);		//�ε� �Ҽ��� ������ ��. �̷л� 1000�� ���;� ������ �׷��� ������ �ʴ´�.

	}

}
