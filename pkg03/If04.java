package pkg03;
import java.util.*;

public class If04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���");
		int x = scan.nextInt();
		
		if(x >= 90) {
			System.out.println("���� : A");
		}
		else if(x >= 80) {
			System.out.println("���� : B");
		}
		else if(x >= 70) {
			System.out.println("���� : C");
		}
		else if(x >= 60) {
			System.out.println("���� : D");
		}
		else //if(x <= 60) { // else 
			System.out.println("���� : F");
		}
	}
//}
