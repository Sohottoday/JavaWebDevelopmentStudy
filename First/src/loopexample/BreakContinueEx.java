package loopexample;

public class BreakContinueEx {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		for(num=0; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println(sum);
		System.out.println(num);
		
		int num1;
		for(num1=0; num1<100; num1++) {
			if((num1 % 3) != 0) continue;		// 3의 배수만 출력하기 위한 조건식
	
			System.out.println(num1);

		}
		
	}

}
