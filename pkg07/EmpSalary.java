package pkg07;

public class EmpSalary {
	public static void main(String[] args) {
		System.out.println("��ǥ �̻� �̸� : " + Salary.ceoname);
		
		Employee hong = new Employee("ȫ�浿", 10000, "����");
		hong.Display();
		
		Employee hee = new Employee("�ڿ���", 5000, "����");
		hee.Display();
		
		Employee soo = new Employee("��ö��",  "����");
		soo.Display();
	}
}
