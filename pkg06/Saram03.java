package pkg06;

public class Saram03 {
	// this 래퍼런스 변수는 클래스 내부에 자체적으로 생성되는 변수
	// 인스턴스 변수를 참조하고자 할 때 사용
	
	static String nationality;
	private String name;	// 인스턴스 변수
	private double height;
	private double weight;
	private String hobby;
	private String blood;
	
	// 이클립스 상단에 source 클릭
	// generate getters and setters 클릭
	public double getHeight() {
		return height;
	}

	public void setHeight(double _height) {
		height = _height;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {	// 매개(지역) 변수
		this.hobby = hobby; // hobby는 String hobby, this.hobby는 인스턴스 hobby를 가리킴
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	// getter 구현 (클래스 외부에서 weight 정보를 간접으로 읽기)
	public double getWeight() {
		return weight;
	}

	// setter 구현 (setter는 반환 타입이 없으므로 void 사용)
	// (클래스 외부에서 weight 정보를 간접으로 쓰기)
	public void setWeight(double num) {
		weight = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String ccc) {
		name = ccc;
	}
	
	public void Display() { // 메소드 생성
		System.out.println("이름 : " + this.name); // 인스턴스 변수 이므로 this사용 가능, 나머지 변수 불가능
		System.out.println("키 : " + this.height);
		System.out.println("몸무게 : " + this.weight);
		System.out.println("취미 : " + this.hobby);
		System.out.println("혈액형 : " + this.blood + "형");
	}
}