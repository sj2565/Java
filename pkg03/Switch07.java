package pkg03;
import java.util.*;

public class Switch07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int x = sc.nextInt();
		
		switch(x) {
		case 1: case 3: case 5:
			System.out.println("홀수");
			break;
		case 2: case 4: case 6:
			System.out.println("짝수");
			break;
		default: // if문에서의 else(마지막)
			System.out.println("1 ~ 6 사이의 정수를 입력하세요");
		} // case 1:
	}     // 	System.out.println("홀수");
}		  // case 2:
          // 	System.out.println("짝수");  이런식으로 써도 됨
