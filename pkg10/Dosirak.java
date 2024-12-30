package pkg10;

import java.util.Arrays;

public class Dosirak {
	private Saram saram;
	private String dname;
	private int price;
	private String[] banchan;

	public Dosirak(Saram saram, String dname, int price, String[] banchan) {
		super();
		this.saram = saram;
		this.dname = dname;
		this.price = price;
		this.banchan = banchan;
	}

	public Saram getSaram() {
		return saram;
	}

	public String getDname() {
		return dname;
	}

	public int getPrice() {
		return price;
	}

	public String[] getBanchan() {
		return banchan;
	}

	@Override
	public String toString() {
		return this.saram + " / " + this.dname + " / " + this.price 
				+ " / " + Arrays.toString(this.banchan); // 배열을 출력하기 위해 Arrays.toString 사용
	}
}
