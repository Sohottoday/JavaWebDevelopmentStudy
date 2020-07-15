package variable;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14f;		//float는 4byte크기 이므로 단순하게 3.14만 적는다면 double형이 되므로 오류가 발생한다.
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		double ddNum = 1;
		for(int i=0; i<10000; i++) {
			ddNum = ddNum + 0.1;
		}
		System.out.println(ddNum);		//부동 소수점 오차의 예. 이론상 1000이 나와야 하지만 그렇게 나오지 않는다.

	}

}
