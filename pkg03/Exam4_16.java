package pkg03;

import java.util.*;

public class Exam4_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("* 개수를 입력해 주세요 : ");
		int star = sc.nextInt();

		for (int i = 1; i <= star; i++) {
			System.out.print("*");
			if (i % 5 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");

		Scanner sc1 = new Scanner(System.in);
		System.out.println("# 개수를 입력해 주세요 : ");
		int star1 = sc1.nextInt();

		for (int i = 1; i <= star1; i++) {
			System.out.print("#");
			if (i % 4 == 0) {
				System.out.println("");
			}
		}
	}
}