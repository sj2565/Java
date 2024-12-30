package pkg09;

import java.util.List;

public class BoardDao {
	public BoardDao() { // Dao : Data Access Object

	}

	public void PushData(List<Board> list) {
		System.out.println("목록을 출력");
		System.out.println("글번호\t제목\t작성자\t일자\t\t조회수");
		for (Board board : list) { // board : 1건, list : 복수개
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