package pkg03;

public class If02 {

	public static void main(String[] args) {
		int x = 8;
		
		if(x % 2 == 0 ) { // ��������
			System.out.println(+x + "�� ¦���̴�.");	
		}else {
			System.out.println(+x + "�� Ȧ���̴�.");
		}
		
		if(x % 2 == 0) { // �ܼ� ���ǹ�
			System.out.println(+x + "�� ¦���̴�.");
		}
	}
}