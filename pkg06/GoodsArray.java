package pkg06;

import java.util.*;

public class GoodsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] arrGoods = new Goods[2];
		
		System.out.println("������ �Է��� �ּ���");

		for (int i = 0; i < arrGoods.length; i++) {

			System.out.println("��ǰ �̸� : ");
			String name = sc.next();

			System.out.println("��ǰ ���� : ");
			int price = sc.nextInt();

			System.out.println("��ǰ ��� : ");
			int stock = sc.nextInt();

			System.out.println("�Ǹŵ� ���� : ");
			int sold = sc.nextInt();
			
			arrGoods[i] = new Goods(name, price, stock, sold);
			arrGoods[i].display();
		}
	}
}
