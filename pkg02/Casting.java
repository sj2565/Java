package pkg02;

public class Casting {

	public static void main(String[] args) {
		double d = 100;
		System.out.println("d: " +d); //암시적 형변환
		
		int i = (int)12.4;
		System.out.println("i: " +i); //명시적 형변환
		
		System.out.println(14/5);
		System.out.println((double)14/5);
		System.out.println((double)(14/5));
		
		int kor = 50, eng = 60, math = 80;
		int total = kor + eng + math;
		double average = (double)total / 3;     // total / 3 하면 63.0, total / 3.0 해도 63.3333...
		System.out.println("총점 : " +total);
		System.out.println("평균 : " +average);
		
		char ch1 = 'c'; // 99  -> ascii 코드 a : 97
		char ch2 = 'a'; // 97
		boolean bool1 = ch1 > ch2;
		System.out.println("bool1 : " +bool1);
		
		int result = ch1 - ch2 + 3;
		System.out.println("result : " +result);
		
		char ch3 = 'c';
		String str = ch3 >= 'A' && ch3 <= 'Z' ? "대문자" : "소문자";
		System.out.println("str : " + str);
	}
}
