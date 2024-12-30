package pkg10;

public class Hakseng {
	private String name;
	private int grade;
	private int ban;
	private int kor;
	private int eng;
	private int math;
	
	public Hakseng(String name, int grade, int ban, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getBan() {
		return ban;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
}