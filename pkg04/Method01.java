package pkg04;
import java.util.*;

public class Method01 {
	
	// 모든 메소드는 동급 레벨로 작성해야 한다. 메인 메소드 안에 작성하면 종속되므로 안됨
	// 메소드 정의/선언/구현
	// 메소드를 정의했다고 해서 스스로 실행하지는 않음. 실행하려면 호출해야함
	static int plus5(int x) {
		int result = x + 5;
		return result;
	}
		
	public static void main(String[] args) { // 메인 메소드
		// 호출) 정의된 메소드를 불러 내는 것
		int x = 3;
		int result = plus5(x); // 위의 메소드 x랑 완전 다른 x
		System.out.println("결과 : " +result);
		System.out.println("결과 : " +plus5(20));
		
		int[] arr= {10, 20, 30};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("결과 : " +plus5(arr[i]));
		}
		
		x = 10;
		int y = 20;
		result = ex(x, y);
		System.out.println("add 결과 : " +result);
	}
	static int ex(int x, int y) {
		int result = x + y;
		return result;
	}
}