package test;

public class test2 {

	static String manage = "강감찬";
	private String name;
	private String department;
	private int money;
	public int total;
	
	public test2(String name, int money, String department) {
		this.name = name;
		this.department = department;
		this.money = money;	
	}
	
	public void calc() {
		if(this.department == "영업" || this.department == "판매") {
			this.total = this.money * 15;
		}
		else {
			this.total = this.money * 12;
		}
		String imsi;
		imsi = this.name +"(" +this.department + "), 급여 :"+this.money + ", 연봉 : " +this.total;
		System.out.println(imsi);
	}
}
