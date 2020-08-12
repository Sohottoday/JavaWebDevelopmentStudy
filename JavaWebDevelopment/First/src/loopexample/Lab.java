 package loopexample;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("홀수를 입력해주세요 : ");
		int num = sc.nextInt();
		char star = '*';
		System.out.println();
		
		for(int n=1; n<=num; n++) {
			if((n % 2) == 0) {
				continue;
			}
			for(int i=1; i<=n; i++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
		
	}

}
