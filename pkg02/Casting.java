package pkg02;

public class Casting {

	public static void main(String[] args) {
		double d = 100;
		System.out.println("d: " +d); //�Ͻ��� ����ȯ
		
		int i = (int)12.4;
		System.out.println("i: " +i); //����� ����ȯ
		
		System.out.println(14/5);
		System.out.println((double)14/5);
		System.out.println((double)(14/5));
		
		int kor = 50, eng = 60, math = 80;
		int total = kor + eng + math;
		double average = (double)total / 3;     // total / 3 �ϸ� 63.0, total / 3.0 �ص� 63.3333...
		System.out.println("���� : " +total);
		System.out.println("��� : " +average);
		
		char ch1 = 'c'; // 99  -> ascii �ڵ� a : 97
		char ch2 = 'a'; // 97
		boolean bool1 = ch1 > ch2;
		System.out.println("bool1 : " +bool1);
		
		int result = ch1 - ch2 + 3;
		System.out.println("result : " +result);
		
		char ch3 = 'c';
		String str = ch3 >= 'A' && ch3 <= 'Z' ? "�빮��" : "�ҹ���";
		System.out.println("str : " + str);
	}
}
