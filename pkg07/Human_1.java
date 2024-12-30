package pkg07;

public class Human_1 { // 슈퍼 클래스
	private String name;
	private String gender;
	private double tall;
	private double weight;
	
	public String getName() {
		return name;
	}

	public Human_1(String name, String gender, double tall, double weight) { // 생성자
		this.name = name;
		this.gender = gender.equalsIgnoreCase("M") ? "남자" : "여자";
		this.tall = tall;
		this.weight = weight;
		this.output1();
	}
	
	public void output1() {
		String imsi = "";
		imsi += "이름 : " +this.name+ ", ";
		imsi += "성별 : " +this.gender+ ", ";
		imsi += "키 : " +this.tall+ ", ";
		imsi += "몸무게 : " +this.weight+ ", ";
		System.out.println(imsi);
	}
}
