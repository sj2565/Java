package pkg07;

public class Salary {
	static String ceoname = "������"; // ����ƽ ����

	private String name;
	private int salary = 3000; // �޿��� ���� �� 3000 ���
	private String department;
	// ������ (�浿, ����)
	public Salary(String name, int salary, String department) { // ������ �̸��� Ŭ���� �̸��� ����
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	// ������ (ö��)
	public Salary(String name, String department) { 
		this.name = name;
		this.department = department;
	}

	public void Display() { // �޼ҵ�
		int bae = 0;
		// ���ڿ� ������ �� �񱳴� equlas() �޼ҵ� ����� �����Ѵ�.
		// ��ҹ��� �������� ���� ���� equalsIgnoreCase() �޼ҵ� ���
		if(this.department.equals("����") || this.department.equals("����")) { // == ��� equals �ᵵ ��
			bae = 15;
		}
		else {
			bae = 12;
		}
				
		String imsi = this.name + " (" + this.department + ")";
		imsi += ", �޿� : " +this.salary + ", ���� : " + (bae * this.salary);
		System.out.println(imsi);
	}
}
