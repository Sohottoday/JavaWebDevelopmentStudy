package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;		// �Ѿ �� �ڵ������� �� ��ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;		// �� ������ ������ �� ������ ���� ��ȯ
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;		//������ �� �������� float�� ��ȯ�ǰ� dNum�� ������ ����� �� double�� �ѹ� �� ��ȯ�ȴ�.
		
		System.out.println(dNum);	
	}

}
