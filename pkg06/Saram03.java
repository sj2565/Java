package pkg06;

public class Saram03 {
	// this ���۷��� ������ Ŭ���� ���ο� ��ü������ �����Ǵ� ����
	// �ν��Ͻ� ������ �����ϰ��� �� �� ���
	
	static String nationality;
	private String name;	// �ν��Ͻ� ����
	private double height;
	private double weight;
	private String hobby;
	private String blood;
	
	// ��Ŭ���� ��ܿ� source Ŭ��
	// generate getters and setters Ŭ��
	public double getHeight() {
		return height;
	}

	public void setHeight(double _height) {
		height = _height;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {	// �Ű�(����) ����
		this.hobby = hobby; // hobby�� String hobby, this.hobby�� �ν��Ͻ� hobby�� ����Ŵ
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	// getter ���� (Ŭ���� �ܺο��� weight ������ �������� �б�)
	public double getWeight() {
		return weight;
	}

	// setter ���� (setter�� ��ȯ Ÿ���� �����Ƿ� void ���)
	// (Ŭ���� �ܺο��� weight ������ �������� ����)
	public void setWeight(double num) {
		weight = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String ccc) {
		name = ccc;
	}
	
	public void Display() { // �޼ҵ� ����
		System.out.println("�̸� : " + this.name); // �ν��Ͻ� ���� �̹Ƿ� this��� ����, ������ ���� �Ұ���
		System.out.println("Ű : " + this.height);
		System.out.println("������ : " + this.weight);
		System.out.println("��� : " + this.hobby);
		System.out.println("������ : " + this.blood + "��");
	}
}