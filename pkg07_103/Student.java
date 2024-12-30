package pkg07_103;

public class Student extends Person {
	private int SchoolYear;
	private String grade;
		
	public Student() {   // 비어있는 생성자 만들기
		
	}

	public Student(String name, int age, String address, int phone, int type,int SchoolYear, String grade) {
		super(name, age, address, phone, type); // 슈퍼클래스에서 가져오기
		this.SchoolYear = SchoolYear;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "학년 : " +this.SchoolYear;
		return imsi;
	}

	public void learn() {
		System.out.println("학년 : " +this.SchoolYear);
		System.out.println("학점 : " +this.grade);
		System.out.println(super.getName() +"이(가) 공부한다.");
	}
}