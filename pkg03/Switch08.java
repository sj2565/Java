package pkg03;
import java.util.*;

public class Switch08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ��� : " );
		int x = sc.nextInt();
		
		switch(x) {
		case 3: case 4: case 5:
			System.out.println(+x +"���� ���Դϴ�.");
			break;
		case 6: case 7: case 8: 	
			System.out.println(+x +"���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(+x +"���� �����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println(+x +"���� �ܿ��Դϴ�.");
			break;
		default :
			System.out.println("1 ~ 12 ������ ������ �Է��ϼ���");
		}
	}
}
