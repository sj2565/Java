package pkg08_118;

public abstract class Shape { // �߻� �޼ҵ带 ���� ���� abstract ���ֱ� -> �߻� Ŭ����
	private String xColor;
	private String yColor;
	public double result;
	
	public Shape(String xColor , String yColor) {
		this.xColor = xColor;
		this.yColor = yColor;
		//this.result = result;
	}
	
	public String getxColor() {
		return xColor;
	}
	
	public String getyColor() {
		return yColor;
	}

	// ���� ���ϱ� �޼ҵ�(�߻� �޼ҵ�� ����)
	public abstract void CalcArea(); // �Ϲ����� �޼ҵ�� �ص� ������ ��
	public abstract void draw();

}
