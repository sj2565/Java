package pkg09;

public class MyException01 {

	public static void main(String[] args) {
		int x = 3, y = 0;
		int[] arr = { 10, 20, 30 };

		// System.out.println(x/y); ���� �߻� �ڵ� �κ��� try�� ����
		// arr[3] = 50;

		try {
			arr[3] = 50;
			System.out.println(x / y);
			System.out.println("������ ������ ����");

		} catch (ArithmeticException e) { // ��� ���� 0���� ������ �� �� ����
			System.out.println("0���� ������ �ȵ�");
		} catch (ArrayIndexOutOfBoundsException e) { // �迭 ��Ұ� �� ���� �� ����
			// Ŭ�����̸� ��ü�̸� = new �������̸�();
			// ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			// e�� ���ܰ�ü��� �Ѵ�
			// �Ϲ������� e, err, error�� ���´�
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("�迭 ��� �� ����");
		} catch (Exception e) {
			System.out.println("��Ÿ ������ ���ܰ� �߻�");
		} finally {
			System.out.println("���� �߻� ���ο� ������� ������ ����");
		}
	}
}