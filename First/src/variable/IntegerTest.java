package variable;

public class IntegerTest {

	public static void main(String[] args) {
		byte bs = 127;
		//byte bs = 128;		표현할 수 있는 한계를 넘으므로 오류가 난다.
		System.out.println(bs);
		
		//int iVal = 12345678900;		이것 역시 표현할 수 있는 한계 초과
		long lVal = 12345678900L;
		System.out.println(lVal);

	}

}
