package pkg03;
import java.util.*;

public class If04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학점을 입력해 주세요");
		int x = scan.nextInt();
		
		if(x >= 90) {
			System.out.println("학점 : A");
		}
		else if(x >= 80) {
			System.out.println("학점 : B");
		}
		else if(x >= 70) {
			System.out.println("학점 : C");
		}
		else if(x >= 60) {
			System.out.println("학점 : D");
		}
		else //if(x <= 60) { // else 
			System.out.println("학점 : F");
		}
	}
//}
