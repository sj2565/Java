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
		System.out.println("��ǰ �̸� : " + name);
		System.out.println("��ǰ ���� : " + price);
		System.out.println("��ǰ ��� : " + stock);
		System.out.println("��ǰ ���� : " + sold);
		this.amount = this.price * this.sold;
		System.out.println("���� : " +amount);
		System.out.println("");
	}
}