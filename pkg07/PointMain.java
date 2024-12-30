package pkg07;
import pkg07_point.ColorPoint;	// �ܺ� �ڿ��� ���� �� �� import ������ ���.

public class PointMain {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		
		cp.set(3,4); // �޼ҵ� ȣ��
		cp.setColor("red");
		cp.showColorPoint();
		
		System.out.println("=================================");
		
		// ���� �迭
		String[] mycolor = new String[] {"blue", "yellow", "green"};
		
		// ��� 3��¥�� �迭 ����
		ColorPoint[] mypoint = new ColorPoint[3];
		for (int i = 0; i < mypoint.length; i++) {
			mypoint[i] = new ColorPoint();
			mypoint[i].set(i, 2*i);
			mypoint[i].setColor(mycolor[i]);
			mypoint[i].showColorPoint();
		}
	}
}