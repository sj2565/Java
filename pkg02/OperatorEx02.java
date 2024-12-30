package pkg02;

public class OperatorEx02 {

	public static void main(String[] args) {
		int n = 10;
		n = -n;
		System.out.println("n = " +n); // -10
		
		n = 100;
		System.out.println("n = " + ++n); // 101
		
		System.out.println("n = " + n++); // 101
	}
}
