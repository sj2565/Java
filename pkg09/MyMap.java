package pkg09;

import java.util.*;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "�Ｚ");
		map.put(2, "�Ե�");
		map.put(3, "���");
		map.put(4, "sk");
		
		boolean bool = map.containsKey(5);
		System.out.println(bool);
		bool = map.containsKey(3);
		System.out.println(bool);
		
		bool = map.containsValue("�ؼ�");
		System.out.println(bool);
		bool = map.containsValue("�Ｚ");
		System.out.println(bool);
		
		if(!map.containsValue("�ؼ�")) {
			map.put(5, "�ؼ�");
		}
		
		Set<Integer> keylist = map.keySet();
		System.out.println(keylist);
		
		System.out.println("�� ���� ����ϱ�");
		for (Integer key : keylist) {
			String value = map.get(key);
			System.out.println("Ű : " + key + ", �� : " +value);
		}
		
		//map.clear();
		
		if (map.isEmpty()) {
			System.out.println("���� ��� �ִ�");
		}
		else {
			System.out.println("�ʿ� ��Ұ� ��� �ִ�");
		}
		
		System.out.println(map);
		System.out.println("����� ũ�� : " +map.size());
	}
}