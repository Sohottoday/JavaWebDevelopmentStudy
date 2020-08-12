package streamex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		// FileInputStream fis = new FileInputStream("reader.txt");			// �ѱ��� ���� ���� ������.

		// FileReader fis = new FileReader("reader.txt");  // �� ��츦 ���ų�
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		
		int i;
		//while((i = fis.read()) != -1 ) {
		//	System.out.print((char)i);
		//}
		//fis.close();		// �ٷ� FileReader �� ���� ���
		
		while((i=isr.read()) != -1) {
			System.out.print((char)i);
		}
		isr.close();
		
	}

}
