package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arraytest = new int[] {1, 2, 3};
		//int[] arraytest = {1, 2, 3};		단, 선언과 동시에 값을 부여하는 경우에만 사용한다.
		
		int[] arr = new int[10];
		int total = 0; 
		
		for(int i=0, num=1; i<arr.length; i++, num++) {
			arr[i] = num;
			System.out.print(arr[i] + "\t");
		}
		
		for(int i=0; i<10; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		int mtotal = 1;
		for(int i=0; i<dArr.length; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);		// 값이 0으로 나오는데 그 이유는 배열을 5개로 선언했지만 유효한 값이 3개밖에 없으므로 0이 곱해진다.
		// 따라서 위와 같이 count를 선언한 후 각 변수에 ++를 설정해준 뒤 for문 내 dArr.length가 아닌 count로 설정해 준다.
	}

}
