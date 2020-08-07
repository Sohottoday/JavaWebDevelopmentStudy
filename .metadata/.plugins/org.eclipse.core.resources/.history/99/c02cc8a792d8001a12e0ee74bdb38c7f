package streamex;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("입력 후 '끝' 이라고 입력하시오 : ");
		try {
			int i; 
			InputStreamReader isr = new InputStreamReader(System.in);		// system.in 이 읽는것을 보조해주는 stream, system.in이 한글을 읽지 못하므로 한글 입력시 필수(문자로 변환해주는 stream)
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
