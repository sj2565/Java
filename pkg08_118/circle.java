package pkg08_118;

public class circle extends Shape {
	private int x;
	private int y;
	private double z;

	public circle(int x, int y, double z, String xColor, String yColor) {
		super(xColor, yColor);
		this.x = x;
		this.y = y;
		this.z = z;
		this.CalcArea();
		this.draw();
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public void CalcArea() {
		super.result = 3.14 * Math.pow(this.z, 2.0);
		String imsi = "�� ������ : " + this.x + ", �߽� : (" + this.x + ", " + this.y + "), ���� : " + super.result;
		System.out.println(imsi);
	}

	@Override
	public void draw() {
		System.out.println("���� ���� : " + super.getxColor() + ", ä��� ���� : " + super.getyColor());
		System.out.println("");
	}
}