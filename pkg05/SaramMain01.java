package pkg05;

public class SaramMain01 {
	public static void main(String[] args) {

		// step02 : 객체 생성.
		// yusin와 soon를 객체라고 부릅니다.

		// 형식 : 클래스이름 객체이름 = new 생성자 이름();
		// 생성자 이름은 반드시 클래스 이름과 동일해야 한다.
		Saram01 yusin;
		yusin = new Saram01();

		// step03 : 멤버 변수의 값 설정
		// 형식 : 객체이름.멤버변수 = value
		// => .을 멤버 참조 연산자라고 함
		// yusin.nationality = "대한민국";
		yusin.name = "김유신";
		yusin.height = 172.5;
		yusin.weight = 72.5;
		yusin.hobby = "당구";
		yusin.blood = "AB";

		Saram01 soon = new Saram01();

		// soon.nationality = "대한민국";
		soon.name = "유관순";
		soon.height = 168.5;
		soon.weight = 50.5;
		soon.hobby = "축구";
		soon.blood = "AB";

		// step04 : 데이터 표현 및 연산 등등
		// System.out.println("국적 : " + yusin.nationality);
		System.out.println("이름 : " + yusin.name);
		System.out.println("키 : " + yusin.height);
		System.out.println("몸무게 : " + yusin.weight);
		System.out.println("취미 : " + yusin.hobby);
		System.out.println("혈액형 : " + yusin.blood);

		System.out.println("");

		// System.out.println("국적 : " + soon.nationality);
		System.out.println("이름 : " + soon.name);
		System.out.println("키 : " + soon.height);
		System.out.println("몸무게 : " + soon.weight);
		System.out.println("취미 : " + soon.hobby);
		System.out.println("혈액형 : " + soon.blood);

		System.out.println("");
		// 배열을 사용하는 방식
		Saram01[] saram = new Saram01[2];

		// 배열 각 요소에 객체 생성
		for (int i = 0; i < saram.length; i++) {
			saram[i] = new Saram01();
		}
		// saram[0].nationality = "대한민국";
		saram[0].name = "강감찬";
		saram[0].height = 185.5;
		saram[0].weight = 80.5;
		saram[0].hobby = "운동";
		saram[0].blood = "A";

		// saram[1].nationality = "대한민국";
		saram[1].name = "을지문덕";
		saram[1].height = 170.5;
		saram[1].weight = 60.5;
		saram[1].hobby = "야구";
		saram[1].blood = "B";

		for (int i = 0; i < saram.length; i++) {
			// System.out.println("국적 : " + saram[i].nationality);
			System.out.println("이름 : " + saram[i].name);
			System.out.println("키 : " + saram[i].height);
			System.out.println("몸무게 : " + saram[i].weight);
			System.out.println("취미 : " + saram[i].hobby);
			System.out.println("혈액형 : " + saram[i].blood);
			System.out.println("");
		}
		
		// static 변수는
		// 형식 : 클래스이름.static변수 로 접근이 가능하므로
		// 클래스 변수라고 부른다.
		Saram01.nationality = "한국";
		// 클래스 변수는 모든 객체들이 참조할 수 있다.
		System.out.println(yusin.nationality);
		
		// 관순이가 static 변수를 수정하고 있다.
		soon.nationality = "대한민국";
		// 관순이가 바꾼 내용을 배열 0번째 객체가 참조할 수 있다.
		System.out.println(saram[0].nationality);
		
		// 따라서 static 변수는 = 전역 변수 = 클래스 변수라고 불린다. 
		
		// total 변수는 main 메소드 안쪽에 들어있다 -> 지역 변수
		int total = 0;
		for (int i = 0; i < 11; i++) {
			// 변수 i 역시 지역 변수이다.
			total += i;
		}
		System.out.println("총합 : " +total);
	}
}
