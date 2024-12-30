package pkg03;

import java.util.*;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;

		while (num > 0) {                                    
			sum += num;
			count++;
			System.out.println("점수를 입력하세요 : ");
			num = sc.nextInt();
		}
		System.out.println("음수나 0이 입력되었으므로 종료합니다.");
		System.out.println("평균 : " + (double)sum/count);
	}
}