package pkg08_118;

public class Triangle extends Shape {
	private int x;
	private int y;

	public Triangle(int x, int y, String xColor, String yColor) {
		super(xColor, yColor);
		this.x = x;
		this.y = y;
		this.CalcArea();
		this.draw();
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public void CalcArea() {
		super.result = this.x * this.y / 2.0;
		String imsi = "�ʺ� : " + this.x + ", ���� : " + this.y + ", ���� : " + super.result;
		System.out.println(imsi);
	}

	@Override
	public void draw() {
		System.out.println("���� ���� : " + super.getxColor() + ", ä��� ���� : " + super.getyColor());
		System.out.println("");
	}
}
