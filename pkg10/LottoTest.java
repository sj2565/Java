package pkg10;
import java.util.*;

public class LottoTest {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		Random rd = new Random();
		int secnum = 0;
	
		while(lotto.size() < 7) {
			// nextInt(45)�� 0���� 44������ ������ ���� 1���� �����Ѵ�.
			int su = rd.nextInt(45)+1;
			
			if (lotto.size() == 6) {
				 secnum = su;
			}
			lotto.add(su);
		}
		// �������� ���� �����ʹ� ���⼭ ����
		lotto.remove(secnum);
		
		System.out.println(lotto);
		System.out.println("2�� ��ȣ : [" + secnum + "]");
	}
}