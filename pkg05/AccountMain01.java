package pkg05;

public class AccountMain01 {

	public static void main(String[] args) {
		AccountClass01 bank = new AccountClass01();
		
		bank.name = "��ö��";
		bank.no = 1234;
		bank.balance = 1000;
		
		System.out.println("�̸� : " +bank.name);
		System.out.println("���� ��ȣ : " +bank.no);
		System.out.println("��ġ�� : " +bank.balance);
		
		System.out.println("");
		
		AccountClass01 bank1 = new AccountClass01();
		
		bank1.name = "�ڿ���";
		bank1.no = 4321;
		bank1.balance = 5000;
		
		System.out.println("�̸� : " +bank1.name);
		System.out.println("���� ��ȣ : " +bank1.no);
		System.out.println("��ġ�� : " +bank1.balance);
	}
}
