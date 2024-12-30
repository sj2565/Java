package pkg05;

public class AccountMain02 {

	public static void main(String[] args) {
		AccountClass01[] bank = new AccountClass01[2];
		
		for (int i = 0; i < bank.length; i++) {
			bank[i] = new AccountClass01();
		}
		
		bank[0].name = "±èÃ¶¼ö";
		bank[0].no = 1234;
		bank[0].balance = 1000;
		
		bank[1].name = "¹Ú¿µÈñ";
		bank[1].no = 4321;
		bank[1].balance = 5000;
		
		for (int i = 0; i < bank.length; i++) {
			System.out.println("ÀÌ¸§ : " +bank[i].name);
			System.out.println("°èÁÂ ¹øÈ£ : " +bank[i].no);
			System.out.println("¿¹Ä¡±Ý : " +bank[i].balance);
			System.out.println("");
		}
	}
}
