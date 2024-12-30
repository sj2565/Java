package pkg09;

public class ExtendFor {

	public static void main(String[] args) {
		int[] arr = {10, 50, 100};
		
		for(int dd : arr) {	// 타입에 따라 변형, 구조 : for(타입 이름(단수개념) : 이름(복수개념) 
			System.out.println(dd);
		}
		
		String[] fruits = {"사과", "배", "체리"};
		for(String bb : fruits) {
			System.out.println(bb);
		}
	}
}