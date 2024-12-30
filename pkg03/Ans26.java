package pkg03;
import java.util.*;

public class Ans26 {

	public static void main(String[] args) {
		Random rd = new Random();	// 랜덤 클래스 생성
		Scanner sc = new Scanner(System.in);
		int answer = rd.nextInt(100) + 1;	// 랜덤 
		int count = 0;
		
		while(true) {
			System.out.println("1 ~ 100 사이의 숫자를 하나 입력하세요 : ");
			int n = sc.nextInt();
			count ++;
		
			if (answer > n) {
				System.out.println(+n +"보다 큰 수 입니다.");
			}
			else if (answer < n) {
				System.out.println(+n +"보다 작은 수 입니다.");
			}
			else {
				System.out.println("정답입니다.");	
				System.out.println(+count +"번만에 맞추셨습니다.");
				break;
			}
		}
	}
}
