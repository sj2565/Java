package pkg03;
import java.util.*;

public class WhileTest2_v1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int total = 0;
		int count = 0;
	
		while(true) {
			System.out.println("������ �Է��ϼ��� : ");
			num = sc.nextInt();
		
			if(num <= 0) {
				break;
			}
			total += num;
			count++;
		}
		System.out.println("�� ���� : " +total);
		double avg = (double)total / count;  // total ����ȯ
		System.out.println("��� : " +avg);
	}
}