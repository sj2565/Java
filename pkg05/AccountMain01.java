package pkg05;

public class AccountMain01 {

	public static void main(String[] args) {
		AccountClass01 bank = new AccountClass01();
		
		bank.name = "김철수";
		bank.no = 1234;
		bank.balance = 1000;
		
		System.out.println("이름 : " +bank.name);
		System.out.println("계좌 번호 : " +bank.no);
		System.out.println("예치금 : " +bank.balance);
		
		System.out.println("");
		
		AccountClass01 bank1 = new AccountClass01();
		
		bank1.name = "박영희";
		bank1.no = 4321;
		bank1.balance = 5000;
		
		System.out.println("이름 : " +bank1.name);
		System.out.println("계좌 번호 : " +bank1.no);
		System.out.println("예치금 : " +bank1.balance);
	}
}
