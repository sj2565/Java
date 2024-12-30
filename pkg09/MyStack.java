package pkg09;
import java.util.*;

public class MyStack {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("bigbang");
		list.add("wonder");
		list.add("kara");
		list.add("soshi");

		System.out.println("��� : " + list);

		Stack<String> st = new Stack<String>();

		for (String item : list) {
			st.push(item);
		}

		// toString() �޼ҵ�� �Էµ� ������� �����ش�.
		System.out.println(st);

		// ����� ������ ��ȯ�� �ش�.(1���� ����)
		// ���� �������� �� �׸��� 1�̴�.
		int idx = st.search("bigbang");
		System.out.println(idx);

		// ����� ������ ��ȯ�� �ش�.(0���� ����)
		// ���� �������� �� �׸��� 0�̴�.
		idx = st.indexOf("bigbang");
		System.out.println(idx);

		boolean bool = st.isEmpty();
		System.out.println("empty() : " +bool);
		
		// 1���� "�����̰�"�� �߰��մϴ�.
		st.insertElementAt("�����̰�", 1);
		
		// �ش� ������ ��Ҹ� ����
		st.removeElementAt(3);
		
		System.out.println("pop �޼ҵ� ����ϱ�");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		try {
			System.out.println(st.pop());
		} catch (EmptyStackException e) {
			System.out.println("���� pop ����");
			e.printStackTrace();
		}
	}
}