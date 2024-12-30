package pkg04;

import java.util.*;

public class Method05 {

	public static void main(String[] args) {
		String name = "";
		int age = 0;
		print(name, age);
	}

	static void print(String name, int age) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String a = sc.nextLine();

		System.out.println("나이 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("이름 : " +a + ", 나이 : " +b);
	}
	
}
