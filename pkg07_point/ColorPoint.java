package pkg07_point;

public class ColorPoint extends Point { // ���� Ŭ����
	String Color; // ���� ����

	// ���� Ŭ������ �������� ù ��° �ٿ� "super() ;" ��� �ڵ尡 �����ִ�.
	// super�� ���� Ŭ������ ��Ī�ϴ� �ܾ��̴�.
	// super()�� ���� Ŭ������ �����ڸ� ȣ���Ѵ�.
	
	//public ColorPoint() { // ������
	//	super(); // ��������� �ۼ��� �ϸ�, �Ͻ����� �ڵ�� �������.
		//System.out.println("b");
	//}

	public void setColor(String color) { // �޼ҵ�
		this.Color = color;
	}

	public void showColorPoint() {
		System.out.println("���� : " +this.Color);
		super.showPrint();
	}
}