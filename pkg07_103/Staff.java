package pkg07_103;

public class Staff extends Person {
	// 해당 클래스에 국한된 데이터는 서브 클래스에만 구현한다.
	private String department; // 부서
	
	public Staff() {
	}
	
	public Staff(String name, int age, String address, int phone, int type, String department) {
		super(name, age, address, phone, type);
		this.department = department;
	}
	
	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "부서 : " +this.department;
		return imsi;
	}

	public void work() {
		System.out.println("부서 : " +this.department);
		String imsi = super.getName() + "이(가) " + this.department +"에서 근무합니다.";
		System.out.println(imsi);
	}
}
