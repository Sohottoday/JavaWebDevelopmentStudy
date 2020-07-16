package ifexample;

import java.util.Scanner;

public class SwitchLab {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 9: case 11: 
				day = 31;
				break;
			case 4: case 6: case 8: case 10: case 12: 
				day = 30;
				break;
			case 2:
				day = 28;
				break;
			default:
				System.out.println("달을 입력하세요");
				day = 0;
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
		sc.close();
	}

}
