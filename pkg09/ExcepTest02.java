package pkg09;

import java.util.*;

public class ExcepTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("첫 번째 정수 입력");
			int su = Integer.parseInt(sc.next());

			System.out.println("두 번째 정수 입력");
			int su1 = Integer.parseInt(sc.next());

			System.out.println(su / su1);
			
		} catch (NumberFormatException e) { // 서브 클래스 개념
			System.out.println("문자열은 불가능");
			e.printStackTrace(); // 에러 정보를 표시해 줌
		} catch (ArithmeticException e) { // 서브 클래스 개념
			System.out.println("0으로 나누기는 불가능");
			e.printStackTrace();
		} catch (Exception e) { // 슈퍼 클래스 개념
			System.out.println("기타 예외 발생");
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 실행");
		}
	}
}
