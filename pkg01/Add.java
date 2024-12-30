package pkg01;

public class Add {
	public static void main(String[] args) {
		int x, y, z; // 변수 선언 or 정의

		// 변수에 값 할당
		x = 3; // 쓰기
		y = 5; // 쓰기
		z = x + y; // 읽고 읽어 더한 다음에 쓰기

		System.out.println("x는" + x); // 읽고 출력
		System.out.println("y는" + y);
		System.out.println("z는" + z);

		// +의 2가지 용도 : 1)덧셈 2) 문자열 결합
		System.out.println(x + "더하기 " + y + "는 " + z + "입니다");

		x = 6; // overwrite(쓰기)
		y = 9;
		z = x * y; 

		System.out.println("x는" + x); 
		System.out.println("y는" + y);
		System.out.println("z는" + z);
	}
}
