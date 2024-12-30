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
		this.gender = gender.equalsIgnoreCase("M") ? "남자" : "여자";
		this.tall = tall;
		this.weight = weight;
		this.output1();
	}

	public void output1() {
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.gender);
		System.out.println("키 : " + this.tall);
		System.out.println("몸무게 : " + this.weight);
	}
}
