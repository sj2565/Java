package pkg08_118;

public class ShapeMain {
	public static void main(String[] args) {
		Shape[] sp = new Shape[3];
		
		sp[0] = new Rectangle(10, 10, "Red", "Green");
		sp[1] = new Triangle(10, 500, "Yellow", "Black");
		sp[2] = new circle(10, 5, 15, "Brown", "White");
		
		// �������̵��� �θ��� �޼ҵ带 �� �Ը��� �°� �ٽ� �����ϴ� ����
		for (int i = 0; i < sp.length; i++) {
			// ��ü ����� �Ͻ��� toString() �޼ҵ带 ȣ���Ѵ�.
			System.out.println(sp[i].toString());
		} // ���� ����� ��
	}
}