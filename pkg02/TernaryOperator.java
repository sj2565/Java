package pkg02;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 7, b = 5;
		// result = 0;
		
		double result = a >= b ? a-b : b-a;         // a >= b 참 or 거짓 판단   -> 참일 때 a-b, 거짓일 때 b-a 
		System.out.println("절대 차이 값 : " +result);
	}
}
