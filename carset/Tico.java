package carset;

public class Tico extends Car {
	private String comments;

	public Tico(String name, int price, String comments) { // ������
		super(name, price);
		this.comments = comments;
	}

	@Override
	public String toString() {
		String imsi = "\n�ڸ�Ʈ : " + this.comments;
		return super.toString() + imsi;
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
		String imsi = super.getName() + "�� ���� �ӵ� : " + super.getSpeed();
		System.out.println(imsi);
	}
}
