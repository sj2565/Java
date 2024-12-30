package pkg03;

public class LargeTest {

	public static void main(String[] args) {
		int su1, su2;
		su1 = 10;
		su2 = 10;
		if(su1 > su2) {
			System.out.println("su1이 더 큽니다. su1 : " +su1);
		}
		else if(su1 == su2) {
			System.out.println("su1과 su2는 같습니다.");
		}
		else {
			System.out.println("su2가 더 큽니다. su2 : " +su2);
		}
	}	
}
