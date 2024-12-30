package pkg06;

public class StaticTest {
	static int x ; // static ����
	int y; // ��� ����, �ν��Ͻ� ���� 
	
	// ���� �޼ҵ嵵 static �޼ҵ�.
	public static void main(String[] args) {
		// Math Ŭ������ ��� �޼ҵ�� static �޼ҵ��̴�.
		// Math Ŭ������ ��ü �������� . �� ������ �����ϴ�.
		System.out.println(Math.pow(2, 3));
		
		System.out.println(StaticTest.x);
		x = 100;
		System.out.println(StaticTest.x);
		
		StaticTest obj = new StaticTest();	// �ν��Ͻ� ������ ��ü�� �����ϰ� dot������(.)�� ����ؼ� ���.
		obj.y = 200;
		System.out.println(obj.y);
		
		StaticTest.add(10, 30);	// add(10, 30)���� �ᵵ ����. 
		
		obj.hello("�ȳ��ϼ���"); // StaticTest.hello�� ���� �Ұ���.
	}
	
	void hello(String aa) { // �ν��Ͻ� �޼ҵ�
		System.out.println(aa);
	}
	static void add(int x, int y) { // static �޼ҵ�
		int result = x + y;
		System.out.println(result);
	}
}