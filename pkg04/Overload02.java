package pkg04;

public class Overload02 {
	public static void main(String[] args) {
		overload("±Â¸ð´×", 5);
		overload(10);
		overload('a', 'd', 'f');
		overload(2.0, 3.0);
	}

	static void overload(String x, int y) {
		for (int i = 1; i <= y; i++) {
			System.out.println(x);
		}
	}

	static void overload(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);
	}

	static void overload(char x, char y, char z) {
		char result = x > y ? y : x;
		result = z > result ? result : z;
		System.out.println(result);
	}
	
	static void overload(double x, double y) {
		double imsi = Math.pow(x, 2) + Math.pow(y, 2);
		System.out.println(imsi);
	}
}
