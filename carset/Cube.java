package carset;

public class Cube extends Car {
	private double fuel;
	
	public Cube(String name, int price, double fuel) { // 생성자
		super(name, price);
		this.fuel = fuel;
	}
	
	@Override
	public String toString() {
		String imsi = "\n연비 : " +this.fuel;
		imsi += "\n연비 효율 : " +this.calc();
		return super.toString() + imsi;
	}
	
	private String calc() { 
		String imsi = "";
		if (this.fuel >= 2.0) {
			imsi = "좋음";
		}
		else if (this.fuel >= 1.0) {
			imsi = "보통";
		}
		else {
			imsi = "나쁨";
		}
		return imsi;
	}

	@Override
	public void speedup(int su) {
		super.setSpeed(+su);
	}

	@Override
	public void speeddown(int su) {
		super.setSpeed(-su);
	}
	
	@Override
	public void display() {
		String imsi = super.getName() +"의 현재 속도 : " + super.getSpeed();
		System.out.println(imsi);
	}
}
