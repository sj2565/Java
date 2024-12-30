package pkg06;

public class StaticTest {
	static int x ; // static 변수
	int y; // 멤버 변수, 인스턴스 변수 
	
	// 메인 메소드도 static 메소드.
	public static void main(String[] args) {
		// Math 클래스의 모든 메소드는 static 메소드이다.
		// Math 클래스는 객체 생성없이 . 찍어서 접근이 가능하다.
		System.out.println(Math.pow(2, 3));
		
		System.out.println(StaticTest.x);
		x = 100;
		System.out.println(StaticTest.x);
		
		StaticTest obj = new StaticTest();	// 인스턴스 변수는 객체를 생성하고 dot연산자(.)를 사용해서 출력.
		obj.y = 200;
		System.out.println(obj.y);
		
		StaticTest.add(10, 30);	// add(10, 30)으로 써도 가능. 
		
		obj.hello("안녕하세요"); // StaticTest.hello는 실행 불가능.
	}
	
	void hello(String aa) { // 인스턴스 메소드
		System.out.println(aa);
	}
	static void add(int x, int y) { // static 메소드
		int result = x + y;
		System.out.println(result);
	}
}