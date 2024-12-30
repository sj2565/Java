package pkg09;

import java.util.*;

public class ExcepTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("ù ��° ���� �Է�");
			int su = Integer.parseInt(sc.next());

			System.out.println("�� ��° ���� �Է�");
			int su1 = Integer.parseInt(sc.next());

			System.out.println(su / su1);
			
		} catch (NumberFormatException e) { // ���� Ŭ���� ����
			System.out.println("���ڿ��� �Ұ���");
			e.printStackTrace(); // ���� ������ ǥ���� ��
		} catch (ArithmeticException e) { // ���� Ŭ���� ����
			System.out.println("0���� ������� �Ұ���");
			e.printStackTrace();
		} catch (Exception e) { // ���� Ŭ���� ����
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
		} finally {
			System.out.println("���� �߻� ���ο� ������� ������ ����");
		}
	}
}
