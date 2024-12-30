package pkg03;

public class If02 {

	public static void main(String[] args) {
		int x = 8;
		
		if(x % 2 == 0 ) { // 양자택일
			System.out.println(+x + "은 짝수이다.");	
		}else {
			System.out.println(+x + "는 홀수이다.");
		}
		
		if(x % 2 == 0) { // 단순 조건문
			System.out.println(+x + "은 짝수이다.");
		}
	}
}