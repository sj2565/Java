package pkg04;

public class OverAdd {

	public static void main(String[] args) {
		// �޼ҵ��� ��ġ ������� �˾Ƽ� �°� ã�ư�
		Add(3, 4);			// ���� 2��
		Add(5.0, 12.0);		// �Ǽ� 2��
		Add(5, 7);			// ���� 2��
		
		int result = Add(3, 5, 7);
	
		Add(2.0, 3.0);		// �Ǽ� 2��
		Add(15, 3.5);
	}
	static void Add(int a, int b) {
		int result = a + b;
		System.out.println("���� 2�� : " +result);
	}
	static int Add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("���� 3�� : " +result);
		return result; 
	}
	static void Add(double a, double b) {
		double result = a + b;
		System.out.println("�Ǽ� 2�� : " +result);
	}
}