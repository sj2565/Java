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
		System.out.println("�̸� �Է� : ");
		String a = sc.nextLine();

		System.out.println("���� �Է� : ");
		int b = sc.nextInt();
		
		System.out.println("�̸� : " +a + ", ���� : " +b);
	}
	
}
