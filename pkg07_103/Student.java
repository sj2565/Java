package pkg07_103;

public class Student extends Person {
	private int SchoolYear;
	private String grade;
		
	public Student() {   // ����ִ� ������ �����
		
	}

	public Student(String name, int age, String address, int phone, int type,int SchoolYear, String grade) {
		super(name, age, address, phone, type); // ����Ŭ�������� ��������
		this.SchoolYear = SchoolYear;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "�г� : " +this.SchoolYear;
		return imsi;
	}

	public void learn() {
		System.out.println("�г� : " +this.SchoolYear);
		System.out.println("���� : " +this.grade);
		System.out.println(super.getName() +"��(��) �����Ѵ�.");
	}
}