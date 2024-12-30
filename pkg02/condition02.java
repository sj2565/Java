package pkg02;

public class condition02 {

	public static void main(String[] args) {
		int a, b;
		a = 2; 
		b = 4;
		int x = a >= b ? 5 : a + 2;
		System.out.println("x : " +x);
		
		int y = 5;
		int result = y/2 == 0 ? y + 3 : y * y; 
		System.out.println("result : " +result);
		
		int n = 10;
		int m = 5;
		result = n > m ? n : m;
		System.out.println("result : " +result);
		
		int c = 36;
		int d = 6;
		
		String str = c%d == 0 ? "yes" : "No";
		System.out.println("str : " +str);
	}
}
