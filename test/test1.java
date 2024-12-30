package test;

public class test1 {
	public static void main(String[] args) {
		System.out.println("대표 이사 이름 : " +test2.manage);
		
		test2 person1 = new test2("홍길동", 10000, "영업");
		person1.calc();
		
		test2 person2 = new test2("이서준", 50000, "구매");
		person2.calc();
	}
}