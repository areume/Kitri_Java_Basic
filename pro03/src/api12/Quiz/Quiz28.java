package api12.Quiz;

import java.util.ArrayList;
import java.util.List;

class Board {
	private String title;
	private String content;
	
	public Board() { }
	
	public Board(String title, String content) {
		this.title=title;
		this.content=content;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
}

class BoardDao {
	private List<Board> list;
	
	public BoardDao() {
		list=new ArrayList<Board>();
		
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
	}
	
	public List<Board> getBoardList() {
		return list;
	}
}

public class Quiz28 {

	public static void main(String[] args) {
		
		BoardDao dao=new BoardDao();
		
		List<Board> list=dao.getBoardList();
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.getTitle()+"\t"+board.getContent());
		}

	}

}
