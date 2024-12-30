package pkg06;

public class Goods {
	String name;
	int price;
	int stock;
	int sold;
	int amount;

	public Goods(String name, int price, int stock, int sold) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.sold = sold;
	}

	public void display() {
		System.out.println("상품 이름 : " + name);
		System.out.println("상품 가격 : " + price);
		System.out.println("상품 재고 : " + stock);
		System.out.println("상품 수량 : " + sold);
		this.amount = this.price * this.sold;
		System.out.println("매출 : " +amount);
		System.out.println("");
	}
}