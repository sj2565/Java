package pkg07;

public class Human {
	public Human(String name, String gender, double tall, double weight) {
		this.name = name;
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}
	
	private String name;
	private String gender;
	private double tall;
	private double weight;
	private double s_weight = 0.0;
	private double fat = 0.0;
	private String result = null;
	private String type;
	
	public void output1() {
		System.out.println("�̸� : " +this.name);
		System.out.println("���� : " +this.gender);
		System.out.println("Ű : " +this.tall);
		System.out.println("������ : " +this.weight);
	}
	public void output2() {
		if (gender == "����") {
			s_weight = (tall - 100.0) * 0.9;
		}
		else {
			s_weight = (tall - 100.0) * 0.85;
		}
		fat = weight / s_weight;
		System.out.println("�񸸵� : " +Math.floor(fat * 1000) / 1000);
		
		if (fat <= 0.9) {
			type = "��ü��";
			System.out.println(type);
		}
		else if (fat >= 0.91 && fat <= 1.10) {
			type = "����(ǥ�� ü��)";
			System.out.println(type);
		}
		else if (fat >= 1.11 && fat <= 1.20) {
			type = "��ü��";
			System.out.println(type);
		}
		else if (fat >= 1.21 && fat <= 1.30) {
			type = "�浵 ��";
			System.out.println(type);
		}
		else if (fat >= 1.31 && fat <= 1.50) {
			type = "�ߵ� ��";
			System.out.println(type);
		}
		else {
			type = "�� ��";
			System.out.println(type);
		}	
	}
	
	public void display() {
		output1();
		output2();
		result = this.name + "���� �񸸵��� " + Math.floor(fat * 1000) / 1000 + "�̰�, ";
		result += this.type +"�Դϴ�.";
		System.out.println(result);
		System.out.println("");
	}
}
