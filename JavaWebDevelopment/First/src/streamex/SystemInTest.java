package streamex;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("�Է� �� '��' �̶�� �Է��Ͻÿ� : ");
		try {
			int i; 
			InputStreamReader isr = new InputStreamReader(System.in);		// system.in �� �д°��� �������ִ� stream, system.in�� �ѱ��� ���� ���ϹǷ� �ѱ� �Է½� �ʼ�(���ڷ� ��ȯ���ִ� stream)
			while((i = isr.read()) != '��') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}