package pkg07_103;

public class Person {
	// 일반적이고 보편적인 데이터는 슈퍼 클래스에 구현한다.
	private String name; // 이름
	private int age; // 나이
	private String address; // 주소
	private int phone; // 전화번호
	private int type; // 타입(직원: 1, 강사: 2, 학생: 3)
	
	public String getName() {
		return name;
	}
	
	public Person() {
	}

	public Person(String name, int age, String address, int phone, int type) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.type = type;
	}
	
	@Override // 다음 메소드는 오버라이딩으로 구현한 내용입니다. (고급 주석)
	public String toString() {
		String imsi = "";
		imsi += "이름 : " +this.name + "\n";
		imsi += "나이 : " +this.age + "\n";
		imsi += "주소 : " +this.address + "\n";
		imsi += "전화번호 : " +this.phone + "\n";
		imsi += "타입 : " +this.type + "\n";
		return imsi;
	}
}
