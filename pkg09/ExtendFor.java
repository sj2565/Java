package pkg09;

public class ExtendFor {

	public static void main(String[] args) {
		int[] arr = {10, 50, 100};
		
		for(int dd : arr) {	// Ÿ�Կ� ���� ����, ���� : for(Ÿ�� �̸�(�ܼ�����) : �̸�(��������) 
			System.out.println(dd);
		}
		
		String[] fruits = {"���", "��", "ü��"};
		for(String bb : fruits) {
			System.out.println(bb);
		}
	}
}