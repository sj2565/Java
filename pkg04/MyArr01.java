package pkg04;

import java.util.Scanner;

public class MyArr01 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int i = 0;
	
		int[] arr = new int[4];	// 타입[] 변수이름 = new 타입[배열 개수]
		
		arr[0] = x + y;
		arr[2] = arr[0] + x;
		arr[1] = arr[0] + arr[2];
		arr[3] = x;
		
		System.out.println(arr[2]);
		
		for(i = 0; i < arr.length; i++) {	// 배열 크기 출력 
			System.out.println(arr[i]);		// 배열 값 출력
		}
	
		char[] arr2 = {'이', '서', '준'};	// 배열 초기화(값이 정해져 있을 때 사용) ex) 소녀시대 멤버 수
		for (i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println(arr2[0]);
	}
}