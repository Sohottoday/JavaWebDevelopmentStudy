package loopexample;

import java.util.Scanner;

public class DoWhileLab {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		
		do {
			num = sc.nextInt();
			sum += num;
		} while(num != 0);
		
		System.out.println(sum);
		sc.close();
		
	}

}
