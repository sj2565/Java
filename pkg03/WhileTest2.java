package pkg03;

import java.util.*;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;

		while (num > 0) {                                    
			sum += num;
			count++;
			System.out.println("������ �Է��ϼ��� : ");
			num = sc.nextInt();
		}
		System.out.println("������ 0�� �ԷµǾ����Ƿ� �����մϴ�.");
		System.out.println("��� : " + (double)sum/count);
	}
}