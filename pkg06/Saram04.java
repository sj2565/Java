package pkg06;

public class Saram04 {
	static String nationality;
	String name;
	private double height;
	private double weight;
	private String hobby;
	private String blood;

	// 생성자는 일반적으로 인스턴스 변수를 초기화할 목적으로 제공해주는 메소드
	// 생성자 호출 시 최초로 시작할 내용이 있으면 명시하면 된다.
	// 기본 생성자 : 눈에 보이지 않는 생성자가 존재.
	// 개발자가 생성자를 구현하면 기본 생성자는 사라진다.

	// 생성자 형식 : public 반환타입 메소드이름(매개변수 리스트) { ...
	public Saram04() { // 메소드 이름은 클래스 이름과 무조건 동일, 반환 타입은 안 적어도 됨, public 안적으면 기본
		this.name = "김철수";
		this.height = 175.5;
		this.weight = 65.05;
		this.hobby = "운동";
		this.blood = "a";
	}
	
	public Saram04(String name, double height, double weight, String hobby, String blood) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
		this.blood = blood;
	}

	public void Display() {
		System.out.println("이름 : " + this.name);
		System.out.println("키 : " + this.height);
		System.out.println("몸무게 : " + this.weight);
		System.out.println("취미 : " + this.hobby);
		System.out.println("혈액형 : " + this.blood + "형");
		System.out.println();
	}
}
