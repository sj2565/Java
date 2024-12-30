package pkg06;
import java.util.Scanner;

public class Sungjuk {
	public Sungjuk() { // ������
		this.InputData();
		this.calcSungjuk();
		this.getHakjum();
	}

	private int finalexam; // �⸻ ����
	private int midexam; // �߰� ���
	private int report; // ����Ʈ
	private int attendance; // �⼮
	private double sungjuk = 0; // ���� ����
	private String hakjum = ""; // ����
	private String comment = ""; // ������ ���� �ڸ�Ʈ

	public void InputData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է����ּ���");
		System.out.println("�⸻ ���� ���� : ");
		int finalexam = sc.nextInt();
		this.finalexam = finalexam;
		System.out.println("�߰� ��� ���� : ");
		int midexam = sc.nextInt();
		this.midexam = midexam;
		System.out.println("����Ʈ ���� : ");
		int report = sc.nextInt();
		this.report = report;
		System.out.println("�⼮ ���� : ");
		int attendance = sc.nextInt();
		this.attendance = attendance;
	}
	public void calcSungjuk() {
		sungjuk = (finalexam * 0.3 + midexam * 0.3 + report * 0.2 + attendance * 0.2) / 4;
		System.out.println("���� ��� : " + sungjuk);
	}

	public void getHakjum() {
		if (sungjuk >= 20) {
			hakjum = "A";
			System.out.println("���� : A");
			comment = "excellent";
		} else if (sungjuk >= 15) {
			hakjum = "B";
			System.out.println("���� : B");
			comment = "excellent";
		} else if (sungjuk >= 10) {
			hakjum = "C";
			System.out.println("���� : C");
			comment = "good";
		} else if (sungjuk >= 5) {
			hakjum = "D";
			System.out.println("���� : D");
			comment = "good";
		} else if (sungjuk <= 0) {
			hakjum = "F";
			System.out.println("���� : F");
			comment = "poor";
		}
		System.out.println("�� : " + comment);
	}

	public void display() {
		System.out.println("------------���------------");
		System.out.println("���� : " +sungjuk);
		System.out.println("���� : " +hakjum);
		System.out.println("�� : " +comment);
	}
}