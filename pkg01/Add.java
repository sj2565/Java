package pkg01;

public class Add {
	public static void main(String[] args) {
		int x, y, z; // ���� ���� or ����

		// ������ �� �Ҵ�
		x = 3; // ����
		y = 5; // ����
		z = x + y; // �а� �о� ���� ������ ����

		System.out.println("x��" + x); // �а� ���
		System.out.println("y��" + y);
		System.out.println("z��" + z);

		// +�� 2���� �뵵 : 1)���� 2) ���ڿ� ����
		System.out.println(x + "���ϱ� " + y + "�� " + z + "�Դϴ�");

		x = 6; // overwrite(����)
		y = 9;
		z = x * y; 

		System.out.println("x��" + x); 
		System.out.println("y��" + y);
		System.out.println("z��" + z);
	}
}
