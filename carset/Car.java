package carset;
		// �߻� Ŭ����					  // �߻� �޼ҵ�
public abstract class Car implements Speed, Display { // ���� �������̵� �� �ص� ��
	private String name; // �̸�
	private int price; // �ܰ�
	private int speed = 0; // �ӵ�

	public Car(String name, int price) { // ������
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) { // ��ȯ�� �����Ƿ� return�� �ᵵ ��
		this.speed += speed;
	}
	
	@Override
	public String toString() {
		String imsi = "�̸� : " + this.name;
		imsi += "\n���� : " + this.price;
		return imsi;
	}
}
