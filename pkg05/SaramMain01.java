package pkg05;

public class SaramMain01 {
	public static void main(String[] args) {

		// step02 : ��ü ����.
		// yusin�� soon�� ��ü��� �θ��ϴ�.

		// ���� : Ŭ�����̸� ��ü�̸� = new ������ �̸�();
		// ������ �̸��� �ݵ�� Ŭ���� �̸��� �����ؾ� �Ѵ�.
		Saram01 yusin;
		yusin = new Saram01();

		// step03 : ��� ������ �� ����
		// ���� : ��ü�̸�.������� = value
		// => .�� ��� ���� �����ڶ�� ��
		// yusin.nationality = "���ѹα�";
		yusin.name = "������";
		yusin.height = 172.5;
		yusin.weight = 72.5;
		yusin.hobby = "�籸";
		yusin.blood = "AB";

		Saram01 soon = new Saram01();

		// soon.nationality = "���ѹα�";
		soon.name = "������";
		soon.height = 168.5;
		soon.weight = 50.5;
		soon.hobby = "�౸";
		soon.blood = "AB";

		// step04 : ������ ǥ�� �� ���� ���
		// System.out.println("���� : " + yusin.nationality);
		System.out.println("�̸� : " + yusin.name);
		System.out.println("Ű : " + yusin.height);
		System.out.println("������ : " + yusin.weight);
		System.out.println("��� : " + yusin.hobby);
		System.out.println("������ : " + yusin.blood);

		System.out.println("");

		// System.out.println("���� : " + soon.nationality);
		System.out.println("�̸� : " + soon.name);
		System.out.println("Ű : " + soon.height);
		System.out.println("������ : " + soon.weight);
		System.out.println("��� : " + soon.hobby);
		System.out.println("������ : " + soon.blood);

		System.out.println("");
		// �迭�� ����ϴ� ���
		Saram01[] saram = new Saram01[2];

		// �迭 �� ��ҿ� ��ü ����
		for (int i = 0; i < saram.length; i++) {
			saram[i] = new Saram01();
		}
		// saram[0].nationality = "���ѹα�";
		saram[0].name = "������";
		saram[0].height = 185.5;
		saram[0].weight = 80.5;
		saram[0].hobby = "�";
		saram[0].blood = "A";

		// saram[1].nationality = "���ѹα�";
		saram[1].name = "��������";
		saram[1].height = 170.5;
		saram[1].weight = 60.5;
		saram[1].hobby = "�߱�";
		saram[1].blood = "B";

		for (int i = 0; i < saram.length; i++) {
			// System.out.println("���� : " + saram[i].nationality);
			System.out.println("�̸� : " + saram[i].name);
			System.out.println("Ű : " + saram[i].height);
			System.out.println("������ : " + saram[i].weight);
			System.out.println("��� : " + saram[i].hobby);
			System.out.println("������ : " + saram[i].blood);
			System.out.println("");
		}
		
		// static ������
		// ���� : Ŭ�����̸�.static���� �� ������ �����ϹǷ�
		// Ŭ���� ������� �θ���.
		Saram01.nationality = "�ѱ�";
		// Ŭ���� ������ ��� ��ü���� ������ �� �ִ�.
		System.out.println(yusin.nationality);
		
		// �����̰� static ������ �����ϰ� �ִ�.
		soon.nationality = "���ѹα�";
		// �����̰� �ٲ� ������ �迭 0��° ��ü�� ������ �� �ִ�.
		System.out.println(saram[0].nationality);
		
		// ���� static ������ = ���� ���� = Ŭ���� ������� �Ҹ���. 
		
		// total ������ main �޼ҵ� ���ʿ� ����ִ� -> ���� ����
		int total = 0;
		for (int i = 0; i < 11; i++) {
			// ���� i ���� ���� �����̴�.
			total += i;
		}
		System.out.println("���� : " +total);
	}
}
