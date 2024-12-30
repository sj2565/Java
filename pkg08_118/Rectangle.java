package pkg08_118;

public class Rectangle extends Shape { // ����Ŭ������ �ִ� �߻� �޼ҵ� ������ �������̵��� �� ���ָ� ������ ��

	private int x;
	private int y;

	public Rectangle(int x, int y, String xColor, String yColor) {
		super(xColor, yColor);
		this.x = x;
		this.y = y;
		this.CalcArea(); // CalcArea�޼ҵ� ȣ��
		this.draw(); // draw�޼ҵ� ȣ��
	}

	@Override
	public String toString() {
		// String imsi = "�ʺ� : " + this.x + ", ���� : " + this.y +", ���� : " +super.result;
		// + ", ���� ���� : " +super.getxColor() + ", ä��� ���� : " +super.getyColor();
		return "";
	}

	@Override
	public void CalcArea() { // ����Ŭ������ �ִ� CalcArea�޼ҵ� ����
		super.result = this.x * this.y;
		String imsi = "�ʺ� : " + this.x + ", ���� : " + this.y + ", ���� : " + super.result;
		System.out.println(imsi);
	}

	@Override
	public void draw() { // ����Ŭ������ �ִ� draw�޼ҵ� ����
		System.out.println("���� ���� : " + super.getxColor() + ", ä��� ���� : " + super.getyColor());
		System.out.println("");
	} // �ܼ��� println�� ����ؼ� ���� toString���� ���� ����ϰ� ��
}
