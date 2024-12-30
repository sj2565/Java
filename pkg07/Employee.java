package pkg07;

public class Employee extends Salary {
	public Employee(String name, int salary, String department) { // 생성자 
		// 개발자가 명시적으로 작성하면 super();는 더 이상 사용이 불가능.
		super(name, salary, department);
	}

	public Employee(String name, String department) { // 생성자
		// 생성자를 만들면 기본 생성자는 사라짐 => 오류
		super(name, department);
	}
}
