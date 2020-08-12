package streamex;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			byte[] bs = new byte[10];
			while ((i = fis.read(bs)) != -1) {
				//for(byte b : bs) {
				//	System.out.print((char)b);
				//}
				
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}		//buffer를 쓸 때 가비지가 남을 수 있으므로 유의해서 사용해야 한다.
				System.out.println();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
