package pkg08_118;

public class ShapeMain {
	public static void main(String[] args) {
		Shape[] sp = new Shape[3];
		
		sp[0] = new Rectangle(10, 10, "Red", "Green");
		sp[1] = new Triangle(10, 500, "Yellow", "Black");
		sp[2] = new circle(10, 5, 15, "Brown", "White");
		
		// 오버라이딩은 부모의 메소드를 내 입맛에 맞게 다시 정의하는 동작
		for (int i = 0; i < sp.length; i++) {
			// 객체 출력은 암시적 toString() 메소드를 호출한다.
			System.out.println(sp[i].toString());
		} // 굳이 안적어도 됨
	}
}