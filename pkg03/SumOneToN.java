package pkg03;
import java.util.*;

public class SumOneToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���� �Է� : ");
		int n = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println("total : " +total);
	}
}