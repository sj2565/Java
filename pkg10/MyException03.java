package pkg10;

public class MyException03 {
	public static void main(String[] args) {
		try {
			String xx = "aa";
			first(xx); // first() �޼ҵ� ȣ��
		} catch (ArithmeticException e) {
			System.out.println("0���� �� ����");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("���� �Է� x");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("��Ÿ ������ ���� �߻�");
		}
	}

	// throws Ű����� ���� ������ ���� ���ÿ��� ���ܸ� ���� ó���� ��Ź/��û�� �� ���
	private static void first(String xx) throws ArithmeticException, NumberFormatException {
		int x = Integer.parseInt(xx);
		second(); // second() �޼ҵ� ȣ��
		// int x = Integer.parseInt(xx);
	}

	private static void second() throws ArithmeticException {
		third(); // third() �޼ҵ� ȣ��
	}

	private static void third() throws ArithmeticException {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
	}
}
