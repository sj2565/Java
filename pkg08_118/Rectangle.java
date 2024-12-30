package pkg08_118;

public class Rectangle extends Shape { // 슈퍼클래스에 있는 추상 메소드 때문에 오버라이딩을 안 해주면 오류가 뜸

	private int x;
	private int y;

	public Rectangle(int x, int y, String xColor, String yColor) {
		super(xColor, yColor);
		this.x = x;
		this.y = y;
		this.CalcArea(); // CalcArea메소드 호출
		this.draw(); // draw메소드 호출
	}

	@Override
	public String toString() {
		// String imsi = "너비 : " + this.x + ", 높이 : " + this.y +", 넓이 : " +super.result;
		// + ", 라인 색상 : " +super.getxColor() + ", 채우기 색상 : " +super.getyColor();
		return "";
	}

	@Override
	public void CalcArea() { // 슈퍼클래스에 있는 CalcArea메소드 구현
		super.result = this.x * this.y;
		String imsi = "너비 : " + this.x + ", 높이 : " + this.y + ", 넓이 : " + super.result;
		System.out.println(imsi);
	}

	@Override
	public void draw() { // 슈퍼클래스에 있는 draw메소드 구현
		System.out.println("라인 색상 : " + super.getxColor() + ", 채우기 색상 : " + super.getyColor());
		System.out.println("");
	} // 단순히 println을 사용해서 위의 toString보다 먼저 출력하게 됨
}
