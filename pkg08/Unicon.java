package pkg08;
									  // 다중 상속을 위해서는 인터페이스를 통해 implements해야 함
public class Unicon extends SomeClass implements Bird, Horse{ // extends랑 implements는 순서 바뀌면 안됨
	private String name;

	public Unicon(String name) {
		this.name = name;
		this.run();
		this.fly();
	}

	@Override
	public String toString() {
		String imsi = "내 이름은 " + this.name + "이야";
		return imsi;
	}

	@Override
	public void run() { // 인터페이스는 추상메소드나 일반메소드 둘 다 오버라이딩 해야 한다.
		String imsi = this.name + "이(가) " + Horse.speed + "으로 달린다.";
		System.out.println(imsi);		// 인터페이스이름.변수이름
	}
	
	@Override
	public void fly() {
		String imsi = this.name + "이(가) " + Bird.speed + "으로 난다.";
		System.out.println(imsi);
		
	}
}
