package test;

public class testH2 {
	private String name;
	private String gender;
	private double tall;
	private double weight;

	public String getName() {
		return name;
	}

	public testH2(String name, String gender, double tall, double weight) {
		this.name = name;
		this.gender = gender.equalsIgnoreCase("M") ? "����" : "����";
		this.tall = tall;
		this.weight = weight;
		this.output1();
	}

	public void output1() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.gender);
		System.out.println("Ű : " + this.tall);
		System.out.println("������ : " + this.weight);
	}
}
