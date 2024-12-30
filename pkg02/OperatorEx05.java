package pkg02;

public class OperatorEx05 {

	public static void main(String[] args) {
		int n = 3;
		boolean bool1 = n > 3;
		System.out.println("bool = " +bool1); // false
		
		int n2 = 5;
		n = n2;
		System.out.println(n == n2); // true
		System.out.println(n != n2); // false
		
		boolean bool2 = (n == 3) && (n2 == 3);
		System.out.println("bool2 = " +bool2); // true
		
		boolean bool3 = (n < 0) && (n2 + 509 > 200);
		System.out.println("bool3 = " +bool3); // false
		
		boolean bool4 = (n > 0 ) || (n2 + 432 / 2 * 2 != 20);
		System.out.println("bool4 = " +bool4); // true		
	}
}
