package pkg05;

class Variable{
	static int x = 100;
	int y = 200;
	private static final int z = 300;
	
	public void Display() {
		int xx = 999;
		System.out.println("���� ������ �ݵ�� �ʱ�ȭ ���.");
		System.out.println("���� ���� : " +xx);
	}
}

public class Class08 {

	public static void main(String[] args) {
		//Variable �ڿ� �� ������ ���� �� ���� ���̴°� => static, int 2��
		
		Variable obj = new Variable();
		//obj �ڿ� �� ������ ���� ��� ���̴°� => int 1��
	}
}
