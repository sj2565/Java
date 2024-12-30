package pkg06;

public class SaramMain04 {

	public static void main(String[] args) {
		// 클래스이름 객체 = new 생성자이름();
		// ****생성자 이름은 클래스 이름과 반드시 동일해야 한다.
		// 단 생성자는 반환 타입을 명시하지 않아도 된다.
		Saram04 df = new Saram04();
		df.Display();
		
		Saram04 hee = new Saram04("박영희", 165.78, 75.0, "게임", "B"); // 생성자 오버로딩
		hee.Display();
	}
}
