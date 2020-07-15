package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i = 1000;
		byte bNum = (byte)i;		//이러한 방식으로 더 정밀하지 못한 형식으로 변환할 경우 자료 소실의 위험이 존재한다.
		System.out.println(bNum);
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;		//	1 + 0 으로 인식
		int iNum2 = (int)(dNum + fNum);			//	2.1이 int형으로 변환되므로 2로 인식된다.
		
		System.out.println(iNum1 + "//" + iNum2);
	}

}
