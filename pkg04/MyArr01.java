package pkg04;

import java.util.Scanner;

public class MyArr01 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int i = 0;
	
		int[] arr = new int[4];	// Ÿ��[] �����̸� = new Ÿ��[�迭 ����]
		
		arr[0] = x + y;
		arr[2] = arr[0] + x;
		arr[1] = arr[0] + arr[2];
		arr[3] = x;
		
		System.out.println(arr[2]);
		
		for(i = 0; i < arr.length; i++) {	// �迭 ũ�� ��� 
			System.out.println(arr[i]);		// �迭 �� ���
		}
	
		char[] arr2 = {'��', '��', '��'};	// �迭 �ʱ�ȭ(���� ������ ���� �� ���) ex) �ҳ�ô� ��� ��
		for (i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println(arr2[0]);
	}
}