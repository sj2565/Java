package pkg01;

public class rectangle {

	public static void main(String[] args) {
		float width, length, round, area;
		
		width = 12.5f;
		length = 10f;
		round = (width + length) *2;
		area = width * length;
		
		System.out.println("�ѷ�: " +round);
		System.out.println("����: " +area);
	}
}