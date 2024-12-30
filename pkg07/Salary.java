package pkg07;

public class Salary {
	static String ceoname = "강감찬"; // 스태틱 변수

	private String name;
	private int salary = 3000; // 급여가 없을 때 3000 출력
	private String department;
	// 생성자 (길동, 영희)
	public Salary(String name, int salary, String department) { // 생성자 이름은 클래스 이름과 동일
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	// 생성자 (철수)
	public Salary(String name, String department) { 
		this.name = name;
		this.department = department;
	}

	public void Display() { // 메소드
		int bae = 0;
		// 문자열 형식의 값 비교는 equlas() 메소드 사용을 권장한다.
		// 대소문자 구분하지 않을 때는 equalsIgnoreCase() 메소드 사용
		if(this.department.equals("영업") || this.department.equals("구매")) { // == 대신 equals 써도 됨
			bae = 15;
		}
		else {
			bae = 12;
		}
				
		String imsi = this.name + " (" + this.department + ")";
		imsi += ", 급여 : " +this.salary + ", 연봉 : " + (bae * this.salary);
		System.out.println(imsi);
	}
}
