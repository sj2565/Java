package pkg03;

public class For04 {

	public static void main(String[] args) {
		int sum0 = 0, sum1 = 0, sum2 = 0;
		int i = 0;

		for (i = 1; i < 10; i++) {
			switch (i % 3) {
			case 0:
				sum0 += i;
				break;
			case 1:
				sum1 += i;
				break;
			case 2:
				sum2 += i;
				break;
			default:
				System.out.println("error");
			}
		}
		System.out.println("3�� ����� ���� : " + sum0);
		System.out.println("3���� �������� �� �������� 1�� ������ ���� : " + sum1);
		System.out.println("3���� �������� �� �������� 2�� ������ ���� : " + sum2);
	}
}