package pkg03;
import java.util.*;

public class Ans26 {

	public static void main(String[] args) {
		Random rd = new Random();	// ���� Ŭ���� ����
		Scanner sc = new Scanner(System.in);
		int answer = rd.nextInt(100) + 1;	// ���� 
		int count = 0;
		
		while(true) {
			System.out.println("1 ~ 100 ������ ���ڸ� �ϳ� �Է��ϼ��� : ");
			int n = sc.nextInt();
			count ++;
		
			if (answer > n) {
				System.out.println(+n +"���� ū �� �Դϴ�.");
			}
			else if (answer < n) {
				System.out.println(+n +"���� ���� �� �Դϴ�.");
			}
			else {
				System.out.println("�����Դϴ�.");	
				System.out.println(+count +"������ ���߼̽��ϴ�.");
				break;
			}
		}
	}
}
