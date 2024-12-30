package pkg02;

public class pdf36p {

	public static void main(String[] args) {
		int a = 3 - -2, b = 3;
		int x = (a >=b) ? 5 : (a + 2);  // x = 5
		
		x += ++a; // x = 11, a = 6
		int y = ++a; // ++a = 7 = y
		y += a + --b; // 7 + 2 + 7 => y = 16
		
		char ch3 = 'D';
		int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2; // --y = 15 = z
		
		int result = 0;
		result = x > y ? z - y : x + z; // x + z = 11 + 15 = 26
		
		System.out.println("result : " +result);
	}
}
