package pkg03;
import java.util.*;

public class Switch08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : " );
		int x = sc.nextInt();
		
		switch(x) {
		case 3: case 4: case 5:
			System.out.println(+x +"월은 봄입니다.");
			break;
		case 6: case 7: case 8: 	
			System.out.println(+x +"월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(+x +"월은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(+x +"월은 겨울입니다.");
			break;
		default :
			System.out.println("1 ~ 12 사이의 정수를 입력하세요");
		}
	}
}
