package pkg10;
import java.util.*;

public class UserException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto = 0;
		
		try {
			System.out.println("로또 번호 입력(1 ~ 45) : ");
			lotto = sc.nextInt();
			
			if (lotto < 0 || lotto > 45) {
				throw new LottoException("잘못된 로또 번호", lotto);
			} else {
				String imsi = lotto + "는 올바른 번호 입니다.";
				System.out.println(imsi);
			}
			
		} catch (LottoException e) {
			System.out.println("문자열 : " + e.toString());
			System.out.println("메세지 : " + e.getMessage());
		}
	}
}