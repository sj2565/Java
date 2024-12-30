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
		System.out.println("이름 : " +this.name);
		System.out.println("성별 : " +this.gender);
		System.out.println("키 : " +this.tall);
		System.out.println("몸무게 : " +this.weight);
	}
	public void output2() {
		if (gender == "남자") {
			s_weight = (tall - 100.0) * 0.9;
		}
		else {
			s_weight = (tall - 100.0) * 0.85;
		}
		fat = weight / s_weight;
		System.out.println("비만도 : " +Math.floor(fat * 1000) / 1000);
		
		if (fat <= 0.9) {
			type = "저체중";
			System.out.println(type);
		}
		else if (fat >= 0.91 && fat <= 1.10) {
			type = "정상(표준 체중)";
			System.out.println(type);
		}
		else if (fat >= 1.11 && fat <= 1.20) {
			type = "과체중";
			System.out.println(type);
		}
		else if (fat >= 1.21 && fat <= 1.30) {
			type = "경도 비만";
			System.out.println(type);
		}
		else if (fat >= 1.31 && fat <= 1.50) {
			type = "중도 비만";
			System.out.println(type);
		}
		else {
			type = "고도 비만";
			System.out.println(type);
		}	
	}
	
	public void display() {
		output1();
		output2();
		result = this.name + "님은 비만도가 " + Math.floor(fat * 1000) / 1000 + "이고, ";
		result += this.type +"입니다.";
		System.out.println(result);
		System.out.println("");
	}
}
