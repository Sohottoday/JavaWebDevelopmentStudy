package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arraytest = new int[] {1, 2, 3};
		//int[] arraytest = {1, 2, 3};		��, ����� ���ÿ� ���� �ο��ϴ� ��쿡�� ����Ѵ�.
		
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
		System.out.println(mtotal);		// ���� 0���� �����µ� �� ������ �迭�� 5���� ���������� ��ȿ�� ���� 3���ۿ� �����Ƿ� 0�� ��������.
		// ���� ���� ���� count�� ������ �� �� ������ ++�� �������� �� for�� �� dArr.length�� �ƴ� count�� ������ �ش�.
	}

}
