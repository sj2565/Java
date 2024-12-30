package pkg10;
import java.util.*;

public class LottoTest {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		Random rd = new Random();
		int secnum = 0;
	
		while(lotto.size() < 7) {
			// nextInt(45)는 0부터 44까지의 임의의 정수 1개를 추출한다.
			int su = rd.nextInt(45)+1;
			
			if (lotto.size() == 6) {
				 secnum = su;
			}
			lotto.add(su);
		}
		// 마지막에 들어온 데이터는 여기서 삭제
		lotto.remove(secnum);
		
		System.out.println(lotto);
		System.out.println("2등 번호 : [" + secnum + "]");
	}
}