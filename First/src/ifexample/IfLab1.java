package ifexample;

import java.util.Scanner;

public class IfLab1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char alpha;
		
		if(score >=90 && score <=100) {
			alpha = 'A';
		} else if(score >= 80) {
			alpha = 'B';
		} else if(score >= 70) {
			alpha = 'C';
		} else if(score >= 60) {
			alpha = 'D';
		} else {
			alpha = 'F';
		}
		
		System.out.println("점수 : " + score);
		System.out.println("등급 : " + alpha);
		
		sc.close();
	}

}
