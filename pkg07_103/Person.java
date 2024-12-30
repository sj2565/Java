package pkg07_103;

public class Person {
	// �Ϲ����̰� �������� �����ʹ� ���� Ŭ������ �����Ѵ�.
	private String name; // �̸�
	private int age; // ����
	private String address; // �ּ�
	private int phone; // ��ȭ��ȣ
	private int type; // Ÿ��(����: 1, ����: 2, �л�: 3)
	
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
	
	@Override // ���� �޼ҵ�� �������̵����� ������ �����Դϴ�. (��� �ּ�)
	public String toString() {
		String imsi = "";
		imsi += "�̸� : " +this.name + "\n";
		imsi += "���� : " +this.age + "\n";
		imsi += "�ּ� : " +this.address + "\n";
		imsi += "��ȭ��ȣ : " +this.phone + "\n";
		imsi += "Ÿ�� : " +this.type + "\n";
		return imsi;
	}
}
