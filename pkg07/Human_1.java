package pkg07;

public class Human_1 { // ���� Ŭ����
	private String name;
	private String gender;
	private double tall;
	private double weight;
	
	public String getName() {
		return name;
	}

	public Human_1(String name, String gender, double tall, double weight) { // ������
		this.name = name;
		this.gender = gender.equalsIgnoreCase("M") ? "����" : "����";
		this.tall = tall;
		this.weight = weight;
		this.output1();
	}
	
	public void output1() {
		String imsi = "";
		imsi += "�̸� : " +this.name+ ", ";
		imsi += "���� : " +this.gender+ ", ";
		imsi += "Ű : " +this.tall+ ", ";
		imsi += "������ : " +this.weight+ ", ";
		System.out.println(imsi);
	}
}
