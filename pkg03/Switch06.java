package pkg03;

public class Switch06 {

	public static void main(String[] args) {
		int score = 55;
		
		switch(score/10) {
		case 10:
			System.out.println("학점은 A");
			break;
		case 9:
			System.out.println("학점은 A");
			break;
		case 8:
			System.out.println("학점은 B");
			break;
		case 7:
			System.out.println("학점은 C");
			break;
		case 6:
			System.out.println("학점은 D");
			break;
		default :
			System.out.println("학점은 F");
		}
	}
}
