package pkg09;

import java.util.*;

public class Myset {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>(); // 꺽쇠 안에가 타입
		
		set.add("강감찬"); // String -> Object로 승급
		set.add(123); // int -> Integer -> Object로 승급
		set.add(false);
		set.add("강감찬"); // 위의 강감찬이랑 겹쳐서 개수로 안 침(중복 x)
		
		set.clear(); // clear : 초기화
		
		set.add("윤아");
		set.add("유리");
		set.add("태연");
		
		boolean bool = set.contains("써니"); // contains : 데이터가 있는지 없는지 확인
		System.out.println(bool); // 써니가 없으므로 false
		System.out.println(set.contains("태연")); // 태연은 있으므로 true
		
		if(!set.contains("써니")) {
			set.add("써니");
		}
		
		System.out.println("확장 for 다루기");
		for(Object item : set) {
			System.out.println(item);	
		}
		
		set.remove("태연"); // 태연 제거
		
		System.out.println(set.toString()); // toString : 배열로 원소를 나열해 줌
		System.out.println("요소의 크기 : " +set.size()); // size : 원소의 개수 알려줌
		
		Set<Integer> seta = new HashSet<Integer>();
		Set<Integer> setb = new HashSet<Integer>();
		
		seta.add(1); seta.add(2); seta.add(3); seta.add(4);
		//seta.add("ddd"); -> 정수만 받기로 해놓고 문자가 들어왔으므로 에러 발생
		
		setb.add(3); setb.add(4); setb.add(5); setb.add(6);
		
		Set<Integer> union = new HashSet<Integer>();
		
		union.addAll(seta); // addAll : 요소들을 합침, 중복 요소는 빠짐
		union.addAll(setb);
		System.out.println("합집합 : " +union);
		
		Set<Integer> ddf = new HashSet<Integer>(seta);
		ddf.retainAll(setb); // retainAll : 공통된 요소들을 보여줌
		System.out.println("교집합 : " +ddf);
	}
}
