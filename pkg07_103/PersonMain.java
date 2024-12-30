package pkg07_103;

public class PersonMain {
	public static void main(String[] args) {
		// ���� ���� : Ŭ�����̸� ��ü�̸� = new �������̸�();

		// ����Ŭ���� ��ü = new ����Ŭ����();
		// �±�) ���� Ŭ���� -> ���� Ŭ����
		Person ps = new Staff();

		// �±� �� ���� Ŭ������ �������� �ѽ������� ������ ����
		// ex) ps. ������ name������ ���̴µ� department������ ������ ����

		showData(ps);

		Person[] saram = { 
				new Student("��ö��", 100, "����", 5184, 10, 55555, "A"),
				new Teacher("��¡��", 700, "��", 123445, 2, "�����α׷���"),
				new Staff("����", 50, "����", 58, 1, "����") };
		for (int i = 0; i < saram.length; i++) {
			System.out.println("-------------------");
			// ��ü ����� �Ͻ������� toString()�޼ҵ带 ȣ���ϴ� �Ͱ� �����ϴ�.
			// saram[i]�� Staff ��ü�̹Ƿ� toString() �޼ҵ带 ����� �� �ִ�.
			System.out.println(saram[i].toString()); // (saram[i]);
			// toString() �޼ҵ�� ��ü ������ ���ڿ��� ������ִ� ������ �Ѵ�.
			// toString() �޼ҵ�� Object Ŭ������ ����ִ�.
			
			if(saram[i] instanceof Student) {
				Student xxx = (Student)saram[i]; // ����
				xxx.learn();
			}
			else if(saram[i] instanceof Teacher) {
				Teacher xxx = (Teacher)saram[i]; // ����
				xxx.teach();
			}
			else if(saram[i] instanceof Staff) {
				Staff xxx = (Staff)saram[i]; // ����
				xxx.work();
			}
		}
	}

	private static void showData(Person ps) {
		// ����) ���� Ŭ���� -> ���� Ŭ����

		// ����Ŭ���� ��ü = (����Ŭ����)����Ŭ���� ��ü;
		Staff mystaff = (Staff) ps;
		// System.out.println(mystaff.department);
	}
}
