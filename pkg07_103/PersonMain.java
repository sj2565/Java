package pkg07_103;

public class PersonMain {
	public static void main(String[] args) {
		// 원래 구조 : 클래스이름 객체이름 = new 생성자이름();

		// 슈퍼클래스 객체 = new 서브클래스();
		// 승급) 서브 클래스 -> 슈퍼 클래스
		Person ps = new Staff();

		// 승급 시 서브 클래스의 변수들은 한시적으로 보이지 않음
		// ex) ps. 찍으면 name변수는 보이는데 department변수는 보이지 않음

		showData(ps);

		Person[] saram = { 
				new Student("김철수", 100, "수원", 5184, 10, 55555, "A"),
				new Teacher("오징어", 700, "집", 123445, 2, "웹프로그래밍"),
				new Staff("김김김", 50, "가산", 58, 1, "영업") };
		for (int i = 0; i < saram.length; i++) {
			System.out.println("-------------------");
			// 객체 출력은 암시적으로 toString()메소드를 호출하는 것과 동일하다.
			// saram[i]는 Staff 객체이므로 toString() 메소드를 사용할 수 있다.
			System.out.println(saram[i].toString()); // (saram[i]);
			// toString() 메소드는 객체 정보를 문자열로 출력해주는 역할을 한다.
			// toString() 메소드는 Object 클래스에 들어있다.
			
			if(saram[i] instanceof Student) {
				Student xxx = (Student)saram[i]; // 강등
				xxx.learn();
			}
			else if(saram[i] instanceof Teacher) {
				Teacher xxx = (Teacher)saram[i]; // 강등
				xxx.teach();
			}
			else if(saram[i] instanceof Staff) {
				Staff xxx = (Staff)saram[i]; // 강등
				xxx.work();
			}
		}
	}

	private static void showData(Person ps) {
		// 강등) 슈퍼 클래스 -> 서브 클래스

		// 서브클래스 객체 = (서브클래스)슈퍼클래스 객체;
		Staff mystaff = (Staff) ps;
		// System.out.println(mystaff.department);
	}
}
