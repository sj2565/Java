package pkg03;

public class For01 {

	public static void main(String[] args) {
		int total = 0;
		for(int x = 1; x < 11; x++) {  // x++ -> x+=1
			total += x;
		}
		System.out.println("รัวี : " +total);
		
		int total1 = 0;
		for(int i = 1; i < 101; i += 3) {
			total1 += i;
		}
		System.out.println("รัวี : " +total1);
		
		int total2 = 0;
		for(int i = 97; i > 1; i -= 5) {
			total2 += i;
		}
		System.out.println("รัวี : " +total2);
		
		int total3 = 0;
		for(int i = 1; i < 97; i += 5) {
			total3 += i * i;
		}
		System.out.println("รัวี : " +total3);
	}
}