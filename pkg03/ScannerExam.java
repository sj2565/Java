package pkg03;
import java.util.*;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = sc.next();
		
		System.out.println("���� : ");
		int age = sc.nextInt();
		
		System.out.println("�̸� : " +name);
		System.out.println("���� : " +age);
	}
}
