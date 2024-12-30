package pkg10;
import java.util.*;

public class UserException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto = 0;
		
		try {
			System.out.println("�ζ� ��ȣ �Է�(1 ~ 45) : ");
			lotto = sc.nextInt();
			
			if (lotto < 0 || lotto > 45) {
				throw new LottoException("�߸��� �ζ� ��ȣ", lotto);
			} else {
				String imsi = lotto + "�� �ùٸ� ��ȣ �Դϴ�.";
				System.out.println(imsi);
			}
			
		} catch (LottoException e) {
			System.out.println("���ڿ� : " + e.toString());
			System.out.println("�޼��� : " + e.getMessage());
		}
	}
}