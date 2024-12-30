package pkg09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("bigbang");
		list.add("���座��");
		list.add("Ʈ���̽�");
		list.add("���");
		list.add("�̹���");
		list.add("Ʈ���̽�");

		int idx = -1;
		idx = list.indexOf("Ʈ���̽�"); // �� ������� �迭�� ���� ���, �ߺ��Ǵ� �� ���� ���
		System.out.println(idx);

		idx = list.lastIndexOf("Ʈ���̽�"); // �ش��Ǵ� ����� ������ �迭���� ���
		System.out.println(idx);

		idx = list.indexOf("�����̰�"); // ��Ұ� �����Ƿ� -1 ���
		System.out.println(idx);

		if (list.indexOf("�����̰�") == -1) {
			System.out.println("�������� ����");
		}

		list.add(2, "�������"); // �迭�� �ι�° ��ҿ� ���� �ֱ� -> �ڿ� �迭 ���� �и�
		list.remove("���"); // ��� ����
		list.set(5, "2am"); // 5��°�� Ʈ���̽� -> 2am���� �ٲ�

		System.out.println("Ȯ�� for ����ϱ�");
		for (String ddd : list) {
			System.out.println(ddd);
		}

		System.out.println("�������� ����");
		Collections.sort(list); // ������ ������ ����
		System.out.println("Ȯ�� for ����ϱ�");
		for (String ddd : list) {
			System.out.println(ddd);
		}

		System.out.println("�������� ����");
		Collections.sort(list, Collections.reverseOrder()); // �������� �������� ����
		System.out.println("Ȯ�� for ����ϱ�");
		for (String ddd : list) {
			System.out.println(ddd);
		}

		System.out.println("���Ƿ� ����");
		Collections.shuffle(list); // ���Ƿ� �迭 ����
		System.out.println("Ȯ�� for ����ϱ�");
		for (String ddd : list) {
			System.out.println(ddd);
		}
		
		System.out.println("get(����) �������� �����ϱ�");
		for(int i = 0; i < list.size(); i++) {
			String item = list.get(i);
			System.out.println(item);
		}
		
		System.out.println(list.toString());
		
		List<String> newlist = list.subList(2, 4); // �迭�� 2��° ��ҿ� 3��° ��� ��� 
		System.out.println(newlist.toString());
		
		List<String> first = list.subList(1, 3);
		List<String> second = list.subList(4, 5);
		List<String> totalist = new ArrayList<String>();
		totalist.addAll(first);
		totalist.addAll(second);
		System.out.println(totalist.toString());
		
		System.out.println("��� ���� : " + list.size()); // set�� �ٸ��� �ߺ���ҵ� ���
		System.out.println(list.toString()); // toString�� ��������
	}
}