package pkg10;
import java.util.*;

public class DosirakMain {
	public static void main(String[] args) {
		
		Saram saram = new Saram("��ö��", "������");
		String[] banchan1 = {"�", "����", "��ġ"};		
		Dosirak saram1 = new Dosirak(saram, "��ȭ���ö�", 4000, banchan1);
		
		List<Dosirak> LD = new ArrayList<Dosirak>();
		
		LD.add(saram1);
		LD.add(new Dosirak(new Saram("�ڿ���", "���뱸"), "�������ö�", 10000, new String[] {"��ġ" ,"���", "��"}));
		System.out.println(LD);
		
		DosirakDao DD = new DosirakDao();
		DD.Delivery(LD);
	}
}