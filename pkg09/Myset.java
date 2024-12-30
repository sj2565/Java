package pkg09;

import java.util.*;

public class Myset {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>(); // ���� �ȿ��� Ÿ��
		
		set.add("������"); // String -> Object�� �±�
		set.add(123); // int -> Integer -> Object�� �±�
		set.add(false);
		set.add("������"); // ���� �������̶� ���ļ� ������ �� ħ(�ߺ� x)
		
		set.clear(); // clear : �ʱ�ȭ
		
		set.add("����");
		set.add("����");
		set.add("�¿�");
		
		boolean bool = set.contains("���"); // contains : �����Ͱ� �ִ��� ������ Ȯ��
		System.out.println(bool); // ��ϰ� �����Ƿ� false
		System.out.println(set.contains("�¿�")); // �¿��� �����Ƿ� true
		
		if(!set.contains("���")) {
			set.add("���");
		}
		
		System.out.println("Ȯ�� for �ٷ��");
		for(Object item : set) {
			System.out.println(item);	
		}
		
		set.remove("�¿�"); // �¿� ����
		
		System.out.println(set.toString()); // toString : �迭�� ���Ҹ� ������ ��
		System.out.println("����� ũ�� : " +set.size()); // size : ������ ���� �˷���
		
		Set<Integer> seta = new HashSet<Integer>();
		Set<Integer> setb = new HashSet<Integer>();
		
		seta.add(1); seta.add(2); seta.add(3); seta.add(4);
		//seta.add("ddd"); -> ������ �ޱ�� �س��� ���ڰ� �������Ƿ� ���� �߻�
		
		setb.add(3); setb.add(4); setb.add(5); setb.add(6);
		
		Set<Integer> union = new HashSet<Integer>();
		
		union.addAll(seta); // addAll : ��ҵ��� ��ħ, �ߺ� ��Ҵ� ����
		union.addAll(setb);
		System.out.println("������ : " +union);
		
		Set<Integer> ddf = new HashSet<Integer>(seta);
		ddf.retainAll(setb); // retainAll : ����� ��ҵ��� ������
		System.out.println("������ : " +ddf);
	}
}
