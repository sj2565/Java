package pkg07;

public class Health_1 extends Human_1 {

	private double s_weight = 0.0;
	private double fat = 0.0;
	private String result = null;

	public Health_1(String name, String gender, double tall, double weight) { // ������
		super(name, gender, tall, weight); // ���� Ŭ�������� ��������
		calculate(tall, gender, weight);
		this.output2();
	}
	public void calculate(double tall, String gender, double weight) {
		double fatrate = gender.equalsIgnoreCase("M") ? 0.9 : 0.85;
		this.s_weight = (tall - 100) * fatrate;
		this.fat = weight / s_weight;

		if (this.fat >= 1.5) {
			this.result = "�� ��";
		} else if (this.fat >= 1.31) {
			this.result = "�ߵ� ��";
		} else if (this.fat >= 1.21) {
			this.result = "�浵 ��";
		} else if (this.fat >= 1.11) {
			this.result = "��ü��";
		} else if (this.fat >= 0.91) {
			this.result = "����(ǥ�� ü��)";
		} else {
			this.result = "��ü��";
		}
	}
	private void output2() {
		String imsi = "";
		imsi += super.getName() + "���� �񸸵��� " +this.fat +"�̰�, " +this.result +"�Դϴ�";
		System.out.println(imsi);
	}
}
