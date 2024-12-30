package pkg10;

import java.util.*;

public class DosirakDao {
	public void Delivery(List<Dosirak> LD) {
		System.out.println("���ö� ��� ����ϱ�");

		for (Dosirak dk : LD) {
			String dname = dk.getDname();
			String address = dk.getSaram().getAddress();
			int price = dk.getPrice();
			String[] banchan = dk.getBanchan();
			
			String imsi = "";
			imsi += dname + "/" +address + "/" +price + "/";
			for (int i = 0; i < banchan.length; i++) {
				imsi += banchan[i] + "/";
			}
			System.out.println(imsi);
		}
	}
}
