package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		int dan;
		int count;
				
		for(dan=2; dan<=9; dan++) {
			for(count=2; count<=9; count++) {
				System.out.print(dan + " x " + count + " = " + (dan*count) + "	");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		dan = 2;
		
		while(dan <= 9) {
			count = 1;
			while(count <= 9) {
				System.out.print(dan + " x " + count + " = " + (dan*count) + "	");
				count++;
			}
			dan++;
			System.out.println();
		}
		
	}

}
