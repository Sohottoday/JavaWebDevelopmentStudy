package variable;

public class CharTest {

	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		//char ch2 = -66;		음수값은 들어갈 수 없다.
		char hangul = '\uAC00';
		System.out.println(hangul);		//유니코드를 활용한 출력

	}

}
