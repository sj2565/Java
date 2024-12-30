package pkg07;

public class Health_1 extends Human_1 {

	private double s_weight = 0.0;
	private double fat = 0.0;
	private String result = null;

	public Health_1(String name, String gender, double tall, double weight) { // 생성자
		super(name, gender, tall, weight); // 슈퍼 클래스에서 가져오기
		calculate(tall, gender, weight);
		this.output2();
	}
	public void calculate(double tall, String gender, double weight) {
		double fatrate = gender.equalsIgnoreCase("M") ? 0.9 : 0.85;
		this.s_weight = (tall - 100) * fatrate;
		this.fat = weight / s_weight;

		if (this.fat >= 1.5) {
			this.result = "고도 비만";
		} else if (this.fat >= 1.31) {
			this.result = "중도 비만";
		} else if (this.fat >= 1.21) {
			this.result = "경도 비만";
		} else if (this.fat >= 1.11) {
			this.result = "과체중";
		} else if (this.fat >= 0.91) {
			this.result = "정상(표준 체중)";
		} else {
			this.result = "저체중";
		}
	}
	private void output2() {
		String imsi = "";
		imsi += super.getName() + "님은 비만도가 " +this.fat +"이고, " +this.result +"입니다";
		System.out.println(imsi);
	}
}
