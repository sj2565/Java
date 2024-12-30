package pkg04;
import java.util.*;

public class Ans24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : "); // 배열 크기 입력
		int size= sc.nextInt(); // 배열 크기 
		
		double total = 0, avg = 0; // 초기화	
		double[] score = new double[size]; // score 변수 생성
		
		for(int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 요소 값 입력 : ");
			score[i] = sc.nextDouble(); // 요소 값 입력, score[0] = ? , score[1] = ? ...
			total += score[i]; // 요소 값 합산
		}
		
		avg = total / size;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " +avg);
	}
}
