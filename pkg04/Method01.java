package pkg04;
import java.util.*;

public class Method01 {
	
	// ��� �޼ҵ�� ���� ������ �ۼ��ؾ� �Ѵ�. ���� �޼ҵ� �ȿ� �ۼ��ϸ� ���ӵǹǷ� �ȵ�
	// �޼ҵ� ����/����/����
	// �޼ҵ带 �����ߴٰ� �ؼ� ������ ���������� ����. �����Ϸ��� ȣ���ؾ���
	static int plus5(int x) {
		int result = x + 5;
		return result;
	}
		
	public static void main(String[] args) { // ���� �޼ҵ�
		// ȣ��) ���ǵ� �޼ҵ带 �ҷ� ���� ��
		int x = 3;
		int result = plus5(x); // ���� �޼ҵ� x�� ���� �ٸ� x
		System.out.println("��� : " +result);
		System.out.println("��� : " +plus5(20));
		
		int[] arr= {10, 20, 30};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("��� : " +plus5(arr[i]));
		}
		
		x = 10;
		int y = 20;
		result = ex(x, y);
		System.out.println("add ��� : " +result);
	}
	static int ex(int x, int y) {
		int result = x + y;
		return result;
	}
}