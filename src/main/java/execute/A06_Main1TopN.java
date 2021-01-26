package execute;

import java.util.List;

import bean.Board;
import dao.BoardDao;

public class A06_Main1TopN {

	public static void main(String[] args) {
		System.out.println("TopN 구문을 수행합니다.");
		BoardDao dao = new BoardDao();
		
		int pageNumber=2;
		int pageSize=3;
		
		int offset = (pageNumber-1)*pageSize;
		int limit = pageSize;
		List<Board> lists = dao.SelectTopN(offset,limit);
		
		for(Board board : lists) {
			System.out.println(board.toString());
		}
		
	
	}

}
