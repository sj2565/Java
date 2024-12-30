package pkg06;

public class SaramMain03 {

	public static void main(String[] args) {
		// 래퍼랜스 변수 2개(saram, hee)
		Saram03 saram = new Saram03(); 
		Saram03 hee = new Saram03(); 
		
		saram.nationality = "대한민국";
		// saram.name = "홍길동";
		saram.setName("홍길동");
		saram.setHeight(150.5);
		//saram.weight = 75; => private 키워드로 인해 직접 접근이 불가능.
		saram.setWeight(75.15);	// 간접 쓰기 
		saram.setHobby("운동");
		saram.setBlood("A");
		
		saram.Display(); // 메인 메소드에 Display메소드 호출.
	}
}