package pkg09;
import java.util.*;

public class MyBoards {
	public static void main(String[] args) {
		Board soo = new Board(10, "aaa", "��ö��", "2021/08/08", 5);
		Board soo1 = new Board(5, "bbb", "������", "2021/08/15", 3);
		Board soo2 = new Board(1, "ccc", "ȫ�浿", "2021/08/20", 1);
		
		List<Board> list = new ArrayList<Board>();
		list.add(soo);
		list.add(soo1);
		list.add(soo2);
		list.add(new Board(7, "ddd", "�̼���", "2021/01/20", 100));
		
		System.out.println("����� ���� : " +list.size());
		
		BoardDao dao = new BoardDao();
		dao.PushData(list);
	}
}