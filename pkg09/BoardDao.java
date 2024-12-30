package pkg09;

import java.util.List;

public class BoardDao {
	public BoardDao() { // Dao : Data Access Object

	}

	public void PushData(List<Board> list) {
		System.out.println("����� ���");
		System.out.println("�۹�ȣ\t����\t�ۼ���\t����\t\t��ȸ��");
		for (Board board : list) { // board : 1��, list : ������
			// System.out.println(board);
			int no = board.getNo();
			String title = board.getTitle();
			String writer = board.getWriter();
			String regdate = board.getRegdate();
			int readcount = board.getReadcount();
			
			String imsi = no + "\t" + title + "\t" + writer + "\t" +
			regdate + "\t" + readcount;
			System.out.println(imsi);
		}
	}
}