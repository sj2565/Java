package pkg07_103;

public class Teacher extends Person {
	private String subject;
	
	public Teacher() {
		
	}

	public Teacher(String name, int age, String address, int phone, int type, String subject) {
		super(name, age, address, phone, type);
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "강의과목 : " +this.subject;
		return imsi;
	}
	
	public void teach() {
		System.out.println(super.getName()+ "이(가) "+ this.subject +"를 합니다.");
	}
}
