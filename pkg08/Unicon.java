package pkg08;
									  // ���� ����� ���ؼ��� �������̽��� ���� implements�ؾ� ��
public class Unicon extends SomeClass implements Bird, Horse{ // extends�� implements�� ���� �ٲ�� �ȵ�
	private String name;

	public Unicon(String name) {
		this.name = name;
		this.run();
		this.fly();
	}

	@Override
	public String toString() {
		String imsi = "�� �̸��� " + this.name + "�̾�";
		return imsi;
	}

	@Override
	public void run() { // �������̽��� �߻�޼ҵ峪 �Ϲݸ޼ҵ� �� �� �������̵� �ؾ� �Ѵ�.
		String imsi = this.name + "��(��) " + Horse.speed + "���� �޸���.";
		System.out.println(imsi);		// �������̽��̸�.�����̸�
	}
	
	@Override
	public void fly() {
		String imsi = this.name + "��(��) " + Bird.speed + "���� ����.";
		System.out.println(imsi);
		
	}
}
