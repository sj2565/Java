package pkg02;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 7, b = 5;
		// result = 0;
		
		double result = a >= b ? a-b : b-a;         // a >= b �� or ���� �Ǵ�   -> ���� �� a-b, ������ �� b-a 
		System.out.println("���� ���� �� : " +result);
	}
}
