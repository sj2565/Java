package test;

public class test1 {
	public static void main(String[] args) {
		System.out.println("��ǥ �̻� �̸� : " +test2.manage);
		
		test2 person1 = new test2("ȫ�浿", 10000, "����");
		person1.calc();
		
		test2 person2 = new test2("�̼���", 50000, "����");
		person2.calc();
	}
}