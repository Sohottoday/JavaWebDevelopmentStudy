package loopexample;

public class WhileEx {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num <=10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
