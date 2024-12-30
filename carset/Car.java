package carset;
		// 추상 클래스					  // 추상 메소드
public abstract class Car implements Speed, Display { // 굳이 오버라이딩 안 해도 됨
	private String name; // 이름
	private int price; // 단가
	private int speed = 0; // 속도

	public Car(String name, int price) { // 생성자
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) { // 반환값 없으므로 return안 써도 됨
		this.speed += speed;
	}
	
	@Override
	public String toString() {
		String imsi = "이름 : " + this.name;
		imsi += "\n가격 : " + this.price;
		return imsi;
	}
}
