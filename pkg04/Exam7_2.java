package pkg04;

public class Exam7_2 {

	public static void main(String[] args) {
		int x = 3;
		int y = 8;
		int z = 5;
	
		int rrrr = min(x, y, z);
		System.out.println("최소값은 : " +rrrr);
	}
	
	static int min(int a, int b, int c) {
		int result = a > b? b : a;
		result = result > c? c: result;
		return result;
	}
}