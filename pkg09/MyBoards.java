package pkg09;
import java.util.*;

public class MyBoards {
	public static void main(String[] args) {
		Board soo = new Board(10, "aaa", "±èÃ¶¼ö", "2021/08/08", 5);
		Board soo1 = new Board(5, "bbb", "±èÀ¯½Å", "2021/08/15", 3);
		Board soo2 = new Board(1, "ccc", "È«±æµ¿", "2021/08/20", 1);
		
		List<Board> list = new ArrayList<Board>();
		list.add(soo);
		list.add(soo1);
		list.add(soo2);
		list.add(new Board(7, "ddd", "ÀÌ¼ø½Å", "2021/01/20", 100));
		
		System.out.println("¿ä¼ÒÀÇ °³¼ö : " +list.size());
		
		BoardDao dao = new BoardDao();
		dao.PushData(list);
	}
}