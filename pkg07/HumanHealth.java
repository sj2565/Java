package pkg07;

public class HumanHealth {
	public static void main(String[] args) {
		Health he = new Health("홍길동", "남자", 175.3, 95.45);
		he.display();
		
		Health she = new Health("가나다", "여자", 162.3, 52.45);
		she.display();
	}
}
