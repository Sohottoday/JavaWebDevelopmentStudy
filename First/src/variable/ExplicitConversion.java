package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i = 1000;
		byte bNum = (byte)i;		//�̷��� ������� �� �������� ���� �������� ��ȯ�� ��� �ڷ� �ҽ��� ������ �����Ѵ�.
		System.out.println(bNum);
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;		//	1 + 0 ���� �ν�
		int iNum2 = (int)(dNum + fNum);			//	2.1�� int������ ��ȯ�ǹǷ� 2�� �νĵȴ�.
		
		System.out.println(iNum1 + "//" + iNum2);
	}

}
