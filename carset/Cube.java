package carset;

public class Cube extends Car {
	private double fuel;
	
	public Cube(String name, int price, double fuel) { // ������
		super(name, price);
		this.fuel = fuel;
	}
	
	@Override
	public String toString() {
		String imsi = "\n���� : " +this.fuel;
		imsi += "\n���� ȿ�� : " +this.calc();
		return super.toString() + imsi;
	}
	
	private String calc() { 
		String imsi = "";
		if (this.fuel >= 2.0) {
			imsi = "����";
		}
		else if (this.fuel >= 1.0) {
			imsi = "����";
		}
		else {
			imsi = "����";
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
		String imsi = super.getName() +"�� ���� �ӵ� : " + super.getSpeed();
		System.out.println(imsi);
	}
}
