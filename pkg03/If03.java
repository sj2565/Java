package pkg03;

public class If03 {

	public static void main(String[] args) {
		int a;
		a = 6;
		
		if(a % 3 == 0) {
			System.out.println("입력된 값이 "+a+ "이므로 " +Math.pow(a, 2) +"입니다.");
		}
		else{
			System.out.println("입력된 값이 "+a+ "이므로 "  + (a + 5) +"입니다.");
		}
	}
}
