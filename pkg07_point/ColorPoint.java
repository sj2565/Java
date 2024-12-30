package pkg07_point;

public class ColorPoint extends Point { // 서브 클래스
	String Color; // 색깔 변수

	// 서브 클래스의 생성자의 첫 번째 줄에 "super() ;" 라는 코드가 숨어있다.
	// super는 슈퍼 클래스를 지칭하는 단어이다.
	// super()는 슈퍼 클래스의 생성자를 호출한다.
	
	//public ColorPoint() { // 생성자
	//	super(); // 명시적으로 작성을 하면, 암시적인 코드는 사라진다.
		//System.out.println("b");
	//}

	public void setColor(String color) { // 메소드
		this.Color = color;
	}

	public void showColorPoint() {
		System.out.println("색상 : " +this.Color);
		super.showPrint();
	}
}