package pkg08;

public interface Horse {
	public static final int speed = 800;
	// final
	// 변수 : read only(상수)
	// 메소드 : 절대로 오버라이딩 못 함
	// 클래스 : 절대로 슈퍼클래스가 될 수 없다.

	public abstract void run(); // 추상 메소드

}
