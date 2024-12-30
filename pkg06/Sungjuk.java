package pkg06;
import java.util.Scanner;

public class Sungjuk {
	public Sungjuk() { // 생성자
		this.InputData();
		this.calcSungjuk();
		this.getHakjum();
	}

	private int finalexam; // 기말 시험
	private int midexam; // 중간 고사
	private int report; // 리포트
	private int attendance; // 출석
	private double sungjuk = 0; // 최종 성적
	private String hakjum = ""; // 학점
	private String comment = ""; // 학점에 대한 코멘트

	public void InputData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정보를 입력해주세요");
		System.out.println("기말 시험 점수 : ");
		int finalexam = sc.nextInt();
		this.finalexam = finalexam;
		System.out.println("중간 고사 점수 : ");
		int midexam = sc.nextInt();
		this.midexam = midexam;
		System.out.println("리포트 점수 : ");
		int report = sc.nextInt();
		this.report = report;
		System.out.println("출석 점수 : ");
		int attendance = sc.nextInt();
		this.attendance = attendance;
	}
	public void calcSungjuk() {
		sungjuk = (finalexam * 0.3 + midexam * 0.3 + report * 0.2 + attendance * 0.2) / 4;
		System.out.println("성적 계산 : " + sungjuk);
	}

	public void getHakjum() {
		if (sungjuk >= 20) {
			hakjum = "A";
			System.out.println("학점 : A");
			comment = "excellent";
		} else if (sungjuk >= 15) {
			hakjum = "B";
			System.out.println("학점 : B");
			comment = "excellent";
		} else if (sungjuk >= 10) {
			hakjum = "C";
			System.out.println("학점 : C");
			comment = "good";
		} else if (sungjuk >= 5) {
			hakjum = "D";
			System.out.println("학점 : D");
			comment = "good";
		} else if (sungjuk <= 0) {
			hakjum = "F";
			System.out.println("학점 : F");
			comment = "poor";
		}
		System.out.println("평가 : " + comment);
	}

	public void display() {
		System.out.println("------------결과------------");
		System.out.println("성적 : " +sungjuk);
		System.out.println("학점 : " +hakjum);
		System.out.println("평가 : " +comment);
	}
}