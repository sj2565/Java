package pkg04;

public class MyArr02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("");
		
		int[] arr2 = new int[98/5+1];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = 5 * i + 3;
			System.out.print(arr2[i] + "\t");
		}
		
		System.out.println("");
		
		int[] arr3 = new int[92/10+1];
		
		for(int i  = 0; i < arr3.length; i++) {
			arr3[i] = 92 - i * 10;
			System.out.print(arr3[i] + "\t");
		}
	}
}
