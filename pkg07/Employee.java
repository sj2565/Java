package pkg07;

public class Employee extends Salary {
	public Employee(String name, int salary, String department) { // ������ 
		// �����ڰ� ��������� �ۼ��ϸ� super();�� �� �̻� ����� �Ұ���.
		super(name, salary, department);
	}

	public Employee(String name, String department) { // ������
		// �����ڸ� ����� �⺻ �����ڴ� ����� => ����
		super(name, department);
	}
}
