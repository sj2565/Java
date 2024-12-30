package pkg03;
import java.util.*;

public class WhileTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		int n = sc.nextInt();
		
		int i = 1;
		while(i < 10) {
			System.out.println(n+ " * " +i +" = " +(i*n));
			i++;
		}
	}
}