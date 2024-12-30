package pkg07_point;

public class Point { // 슈퍼 클래스
	private double xpos; // x좌표 변수
	private double ypos; // y좌표 변수

	// 상속 관계에서 생성자는 부모것이 먼저 호출된다.
	//public Point() { // 생성자
	//	System.out.println("ㅠ");
	//}
	public void set(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public void showPrint() {
		String imsi = "좌표 : (" +this.xpos + ", " +this.ypos +")";
		System.out.println(imsi);
	}
}