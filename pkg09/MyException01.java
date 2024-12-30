package pkg09;

public class MyException01 {

	public static void main(String[] args) {
		int x = 3, y = 0;
		int[] arr = { 10, 20, 30 };

		// System.out.println(x/y); 문제 발생 코드 부분을 try에 쓰기
		// arr[3] = 50;

		try {
			arr[3] = 50;
			System.out.println(x / y);
			System.out.println("오류가 없으면 실행");

		} catch (ArithmeticException e) { // 어떠한 수를 0으로 나누려 할 때 쓰임
			System.out.println("0으로 나누면 안됨");
		} catch (ArrayIndexOutOfBoundsException e) { // 배열 요소가 안 맞을 때 쓰임
			// 클래스이름 객체이름 = new 생성자이름();
			// ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			// e를 예외객체라고 한다
			// 일반적으로 e, err, error로 적는다
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("배열 요소 안 맞음");
		} catch (Exception e) {
			System.out.println("기타 나머지 예외가 발생");
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 실행");
		}
	}
}