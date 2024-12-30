package pkg04;

public class OverAdd {

	public static void main(String[] args) {
		// 메소드의 위치 상관없이 알아서 맞게 찾아감
		Add(3, 4);			// 정수 2개
		Add(5.0, 12.0);		// 실수 2개
		Add(5, 7);			// 정수 2개
		
		int result = Add(3, 5, 7);
	
		Add(2.0, 3.0);		// 실수 2개
		Add(15, 3.5);
	}
	static void Add(int a, int b) {
		int result = a + b;
		System.out.println("정수 2개 : " +result);
	}
	static int Add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("정수 3개 : " +result);
		return result; 
	}
	static void Add(double a, double b) {
		double result = a + b;
		System.out.println("실수 2개 : " +result);
	}
}