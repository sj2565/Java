package pkg07_point;

public class Point { // ���� Ŭ����
	private double xpos; // x��ǥ ����
	private double ypos; // y��ǥ ����

	// ��� ���迡�� �����ڴ� �θ���� ���� ȣ��ȴ�.
	//public Point() { // ������
	//	System.out.println("��");
	//}
	public void set(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	public void showPrint() {
		String imsi = "��ǥ : (" +this.xpos + ", " +this.ypos +")";
		System.out.println(imsi);
	}
}