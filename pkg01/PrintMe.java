package pkg01;

public class PrintMe {

	public static void main(String[] args) {
		String name; // 이름
		int age; // 나이
		double height; // 키(double)
		float weight; // 몸무게(float)
		String blood; // 혈액형
		boolean bool; // 진위형
		
		name = "홍길동";
		age = 27;
		height = 178.1;
		weight = 75.3f;
		blood = "AB";
		bool = false;
		
		System.out.println("이름: " +name);
		System.out.println("나이: " +age);
		System.out.println("키: " +height);
		System.out.println("몸무게: " +weight);
		System.out.println("혈액형: " +blood);
		System.out.println("진위형: " +bool);
	}

}
