package pkg09;

public class Board {
	private int no;
	private String title;
	private String writer;
	private String regdate;
	private int readcount;
	
	public Board(int no, String title, String writer, String regdate, int readcount) {
		//super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regdate = regdate;
		this.readcount = readcount;
	}

	@Override
	public String toString() {
		return "Board [no = " + no + ", title = " + title + ", writer = " 
	+ writer + ", regdate = " + regdate + ", readcount = " + readcount + "]";
	}
	
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public int getReadcount() {
		return readcount;
	}	
}