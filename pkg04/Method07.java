package pkg04;
import java.util.*;

public class Method07 {
	public static void main(String[] args) {
		int a = 0;
		gugudan(a);
	}
	
	static void gugudan(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �� �̸� : ");
		int n = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			System.out.println(n+ " X " +i +" = " +(i*n));
			i++;
		}
	}
}
/**
 *  while�� ���
 *	for (int i = 1; i < 10; i++) {
 *		String imsi = n + " * " + i + " = " + (n * i);
 *		System.out.println(imsi); 
 */
