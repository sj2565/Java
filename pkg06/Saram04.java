package pkg06;

public class Saram04 {
	static String nationality;
	String name;
	private double height;
	private double weight;
	private String hobby;
	private String blood;

	// �����ڴ� �Ϲ������� �ν��Ͻ� ������ �ʱ�ȭ�� �������� �������ִ� �޼ҵ�
	// ������ ȣ�� �� ���ʷ� ������ ������ ������ ����ϸ� �ȴ�.
	// �⺻ ������ : ���� ������ �ʴ� �����ڰ� ����.
	// �����ڰ� �����ڸ� �����ϸ� �⺻ �����ڴ� �������.

	// ������ ���� : public ��ȯŸ�� �޼ҵ��̸�(�Ű����� ����Ʈ) { ...
	public Saram04() { // �޼ҵ� �̸��� Ŭ���� �̸��� ������ ����, ��ȯ Ÿ���� �� ��� ��, public �������� �⺻
		this.name = "��ö��";
		this.height = 175.5;
		this.weight = 65.05;
		this.hobby = "�";
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
		System.out.println("�̸� : " + this.name);
		System.out.println("Ű : " + this.height);
		System.out.println("������ : " + this.weight);
		System.out.println("��� : " + this.hobby);
		System.out.println("������ : " + this.blood + "��");
		System.out.println();
	}
}
