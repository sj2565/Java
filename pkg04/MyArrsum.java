package pkg04;

public class MyArrsum {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };

		int hap = sum(arr);
		System.out.println(hap);
		
		int x = 10; 
		int y = 20;
		int z = 30;
		int ss = ex(x, y, z);
		System.out.println(ss);
	}
	
	static int sum(int[] arr) {                // 이렇게 써도 됨
		int result = arr[0] + arr[1] + arr[2]; // int result = 0;
		return result;                         // for (int i = 0; i < arr.length; i++)
	}                                          // result += arr[i]
											   // return result;
	static int ex(int x, int y, int z) {
		int result = x + y + z;
		return result;
	}
}
