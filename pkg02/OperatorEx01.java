package pkg02;

public class OperatorEx01 {

	public static void main(String[] args) {
		boolean bool = true;
		bool = !bool;
		System.out.println("bool = " +bool); // false
		
		System.out.println("" + 8 + 8); // 88
		System.out.println(8 + 8 + ""); // 16
		
		System.out.println("" + (8 * 8)); // 64
		System.out.println(8 + (8 + "")); // 88
	}
}
