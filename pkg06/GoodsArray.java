package pkg06;

import java.util.*;

public class GoodsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] arrGoods = new Goods[2];
		
		System.out.println("정보를 입력해 주세요");

		for (int i = 0; i < arrGoods.length; i++) {

			System.out.println("상품 이름 : ");
			String name = sc.next();

			System.out.println("상품 가격 : ");
			int price = sc.nextInt();

			System.out.println("상품 재고 : ");
			int stock = sc.nextInt();

			System.out.println("판매된 수량 : ");
			int sold = sc.nextInt();
			
			arrGoods[i] = new Goods(name, price, stock, sold);
			arrGoods[i].display();
		}
	}
}
