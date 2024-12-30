package pkg03;

public class While01 {

	public static void main(String[] args) {
		
		int total = 0;
		int i = 0;
		while(i < 11) {
			total += i;
			i++;
		}
		System.out.println("รัวี : " +total);
		
		total = 0;
		i = 1;
		while(i < 101) {
			total += i;
			i += 3;
		}
		System.out.println("รัวี : " +total);
		
		total = 0;
		i = 97;
		while(i > 0) {
			total += i;
			i -= 5;
		}
		System.out.println("รัวี : " +total);
		
		total = 0;
		i = 1;
		while(i < 97) {
			total += i * i;
			i += 5;
		}
		System.out.println("รัวี : " +total);
	}
}
