package pkg04;
import java.util.*;

public class Ans24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ��� : "); // �迭 ũ�� �Է�
		int size= sc.nextInt(); // �迭 ũ�� 
		
		double total = 0, avg = 0; // �ʱ�ȭ	
		double[] score = new double[size]; // score ���� ����
		
		for(int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "��° ��� �� �Է� : ");
			score[i] = sc.nextDouble(); // ��� �� �Է�, score[0] = ? , score[1] = ? ...
			total += score[i]; // ��� �� �ջ�
		}
		
		avg = total / size;
		System.out.println("���� : " + total);
		System.out.println("��� : " +avg);
	}
}
