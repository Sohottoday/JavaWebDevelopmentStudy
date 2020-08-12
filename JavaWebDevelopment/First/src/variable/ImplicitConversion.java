package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;		// 넘어갈 때 자동적으로 형 변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;		// 덜 정밀한 수에서 더 정밀한 수로 변환
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;		//더해질 때 정수형이 float로 변환되고 dNum의 변수에 저장될 때 double로 한번 더 변환된다.
		
		System.out.println(dNum);	
	}

}
