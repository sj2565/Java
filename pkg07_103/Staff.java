package pkg07_103;

public class Staff extends Person {
	// �ش� Ŭ������ ���ѵ� �����ʹ� ���� Ŭ�������� �����Ѵ�.
	private String department; // �μ�
	
	public Staff() {
	}
	
	public Staff(String name, int age, String address, int phone, int type, String department) {
		super(name, age, address, phone, type);
		this.department = department;
	}
	
	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "�μ� : " +this.department;
		return imsi;
	}

	public void work() {
		System.out.println("�μ� : " +this.department);
		String imsi = super.getName() + "��(��) " + this.department +"���� �ٹ��մϴ�.";
		System.out.println(imsi);
	}
}
