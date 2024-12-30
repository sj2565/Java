package pkg10;
import java.util.*;

public class DosirakMain {
	public static void main(String[] args) {
		
		Saram saram = new Saram("±èÃ¶¼ö", "¸ÁÆ÷µ¿");
		String[] banchan1 = {"¾î¹¬", "Á¦À°", "±èÄ¡"};		
		Dosirak saram1 = new Dosirak(saram, "¸ÅÈ­µµ½Ã¶ô", 4000, banchan1);
		
		List<Dosirak> LD = new ArrayList<Dosirak>();
		
		LD.add(saram1);
		LD.add(new Dosirak(new Saram("¹Ú¿µÈñ", "¿µÅë±¸"), "¶¯¶¯µµ½Ã¶ô", 10000, new String[] {"¸êÄ¡" ,"µ·±î½º", "¹ä"}));
		System.out.println(LD);
		
		DosirakDao DD = new DosirakDao();
		DD.Delivery(LD);
	}
}