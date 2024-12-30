package pkg05;

class Variable{
	static int x = 100;
	int y = 200;
	private static final int z = 300;
	
	public void Display() {
		int xx = 999;
		System.out.println("지역 변수는 반드시 초기화 요망.");
		System.out.println("지역 변수 : " +xx);
	}
}

public class Class08 {

	public static void main(String[] args) {
		//Variable 뒤에 점 찍으면 변수 몇 개가 보이는가 => static, int 2개
		
		Variable obj = new Variable();
		//obj 뒤에 점 찍으면 변수 몇개가 보이는가 => int 1개
	}
}
