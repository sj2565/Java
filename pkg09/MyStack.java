package pkg09;
import java.util.*;

public class MyStack {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("bigbang");
		list.add("wonder");
		list.add("kara");
		list.add("soshi");

		System.out.println("목록 : " + list);

		Stack<String> st = new Stack<String>();

		for (String item : list) {
			st.push(item);
		}

		// toString() 메소드는 입력된 순서대로 보여준다.
		System.out.println(st);

		// 요소의 색인을 반환해 준다.(1부터 시작)
		// 가장 마지막에 들어간 항목이 1이다.
		int idx = st.search("bigbang");
		System.out.println(idx);

		// 요소의 색인을 반환해 준다.(0부터 시작)
		// 가장 마지막에 들어간 항목이 0이다.
		idx = st.indexOf("bigbang");
		System.out.println(idx);

		boolean bool = st.isEmpty();
		System.out.println("empty() : " +bool);
		
		// 1번에 "오마이걸"를 추가합니다.
		st.insertElementAt("오마이걸", 1);
		
		// 해당 색인의 요소를 제거
		st.removeElementAt(3);
		
		System.out.println("pop 메소드 사용하기");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		try {
			System.out.println(st.pop());
		} catch (EmptyStackException e) {
			System.out.println("스택 pop 오류");
			e.printStackTrace();
		}
	}
}