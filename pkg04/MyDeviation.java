package pkg04;

public class MyDeviation {
	public static void main(String[] args) {
		int[] arr = {10, 30, 40, 80};
		double result = deviation(arr);
		System.out.println("Ç¥ÁØÆíÂ÷ : " +result);
	}
	
	static double deviation(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("ÃÑÇÕ : " +total);
		double imsi = 0.0;
		double result = 0.0;
		double avg = (double)total / arr.length;
		System.out.println("Æò±Õ : " +avg);
		for (int i = 0; i < arr.length; i++) {
			imsi += (arr[i] - avg) * (arr[i] - avg) / arr.length;
			result = Math.sqrt(imsi);
		}
		System.out.println("imsi : " +imsi);
		return result;
	}
}