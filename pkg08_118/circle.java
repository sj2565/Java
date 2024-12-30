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
		String imsi = "원 반지름 : " + this.x + ", 중심 : (" + this.x + ", " + this.y + "), 넓이 : " + super.result;
		System.out.println(imsi);
	}

	@Override
	public void draw() {
		System.out.println("라인 색상 : " + super.getxColor() + ", 채우기 색상 : " + super.getyColor());
		System.out.println("");
	}
}