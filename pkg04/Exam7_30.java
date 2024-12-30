package pkg04;

public class Exam7_30 {

	public static void main(String[] args) {
		int a = 3, b = 8, c = 4;
		int[] arr = { 20, 50, 70, 30 };

		int result;
		result = min(a, b);
		System.out.println("�ּڰ� : " + result);

		result = min(a, b, c);
		System.out.println("�ּڰ� : " + result);
		
		result = min(arr);
		System.out.println("�ּҰ� : " + result);
	}

	static int min(int[] arr) {
		int minval = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(minval > arr[i]) {
				minval = arr[i];
			}
		}
		return minval;
	}
	
	static int min(int a, int b, int c) {
		int x = 0;
		x = a > b ? b : a;
		x = x > c ? c : x;
		return x;
	}

	static int min(int a, int b) {
		return a > b ? b : a;
	}
}
