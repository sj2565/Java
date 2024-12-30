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
		String imsi = "너비 : " + this.x + ", 높이 : " + this.y + ", 넓이 : " + super.result;
		System.out.println(imsi);
	}

	@Override
	public void draw() {
		System.out.println("라인 색상 : " + super.getxColor() + ", 채우기 색상 : " + super.getyColor());
		System.out.println("");
	}
}
