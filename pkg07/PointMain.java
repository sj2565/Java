package pkg07;
import pkg07_point.ColorPoint;	// 외부 자원을 가져 올 때 import 구문을 사용.

public class PointMain {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		
		cp.set(3,4); // 메소드 호출
		cp.setColor("red");
		cp.showColorPoint();
		
		System.out.println("=================================");
		
		// 색상 배열
		String[] mycolor = new String[] {"blue", "yellow", "green"};
		
		// 요소 3개짜리 배열 선언
		ColorPoint[] mypoint = new ColorPoint[3];
		for (int i = 0; i < mypoint.length; i++) {
			mypoint[i] = new ColorPoint();
			mypoint[i].set(i, 2*i);
			mypoint[i].setColor(mycolor[i]);
			mypoint[i].showColorPoint();
		}
	}
}