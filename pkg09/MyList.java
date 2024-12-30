package pkg09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("bigbang");
		list.add("레드벨벳");
		list.add("트와이스");
		list.add("브걸");
		list.add("이무진");
		list.add("트와이스");

		int idx = -1;
		idx = list.indexOf("트와이스"); // 각 순서대로 배열의 순서 출력, 중복되는 건 먼저 출력
		System.out.println(idx);

		idx = list.lastIndexOf("트와이스"); // 해당의는 요소의 마지막 배열순서 출력
		System.out.println(idx);

		idx = list.indexOf("오마이걸"); // 요소가 없으므로 -1 출력
		System.out.println(idx);

		if (list.indexOf("오마이걸") == -1) {
			System.out.println("존재하지 않음");
		}

		list.add(2, "아이즈원"); // 배열의 두번째 요소에 우우우 넣기 -> 뒤에 배열 순서 밀림
		list.remove("브걸"); // 브걸 제거
		list.set(5, "2am"); // 5번째에 트와이스 -> 2am으로 바뀜

		System.out.println("확장 for 사용하기");
		for (String ddd : list) {
			System.out.println(ddd);
		}

		System.out.println("오름차순 정렬");
		Collections.sort(list); // 가나다 순으로 정렬
		System.out.println("확장 for 사용하기");
		for (String ddd : list) {
			System.out.println(ddd);
		}

		System.out.println("내림차순 정렬");
		Collections.sort(list, Collections.reverseOrder()); // 오름차순 역순으로 정렬
		System.out.println("확장 for 사용하기");
		for (String ddd : list) {
			System.out.println(ddd);
		}

		System.out.println("임의로 섞기");
		Collections.shuffle(list); // 임의로 배열 섞음
		System.out.println("확장 for 사용하기");
		for (String ddd : list) {
			System.out.println(ddd);
		}
		
		System.out.println("get(숫자) 형식으로 추출하기");
		for(int i = 0; i < list.size(); i++) {
			String item = list.get(i);
			System.out.println(item);
		}
		
		System.out.println(list.toString());
		
		List<String> newlist = list.subList(2, 4); // 배열의 2번째 요소와 3번째 요소 출력 
		System.out.println(newlist.toString());
		
		List<String> first = list.subList(1, 3);
		List<String> second = list.subList(4, 5);
		List<String> totalist = new ArrayList<String>();
		totalist.addAll(first);
		totalist.addAll(second);
		System.out.println(totalist.toString());
		
		System.out.println("요소 개수 : " + list.size()); // set과 다르게 중복요소도 계산
		System.out.println(list.toString()); // toString도 마찬가지
	}
}