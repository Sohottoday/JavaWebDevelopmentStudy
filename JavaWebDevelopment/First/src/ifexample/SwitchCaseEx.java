package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rank = sc.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = '��';
				break;
			case 2 : medalColor = '��';
				break;
			case 3 : medalColor = '��';
				break;
			default : medalColor = '��';
		}
		System.out.println(rank + "���� " + medalColor + "�޴� �Դϴ�.");
		sc.close();
		
	}

}
