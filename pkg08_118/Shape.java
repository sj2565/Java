package pkg08_118;

public abstract class Shape { // 추상 메소드를 쓰기 위해 abstract 써주기 -> 추상 클래스
	private String xColor;
	private String yColor;
	public double result;
	
	public Shape(String xColor , String yColor) {
		this.xColor = xColor;
		this.yColor = yColor;
		//this.result = result;
	}
	
	public String getxColor() {
		return xColor;
	}
	
	public String getyColor() {
		return yColor;
	}

	// 면적 구하기 메소드(추상 메소드로 구현)
	public abstract void CalcArea(); // 일반적인 메소드로 해도 나오긴 함
	public abstract void draw();

}
