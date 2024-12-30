package pkg10;

public class MyException03 {
	public static void main(String[] args) {
		try {
			String xx = "aa";
			first(xx); // first() 메소드 호출
		} catch (ArithmeticException e) {
			System.out.println("0으로 못 나눔");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("문자 입력 x");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 나머지 예외 발생");
		}
	}

	// throws 키워드는 하위 스택이 상위 스택에게 예외를 대한 처리를 부탁/요청할 때 사용
	private static void first(String xx) throws ArithmeticException, NumberFormatException {
		int x = Integer.parseInt(xx);
		second(); // second() 메소드 호출
		// int x = Integer.parseInt(xx);
	}

	private static void second() throws ArithmeticException {
		third(); // third() 메소드 호출
	}

	private static void third() throws ArithmeticException {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
	}
}
