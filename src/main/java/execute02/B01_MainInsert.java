package execute02;

import java.sql.Date;

import bean.Board;
import dao.BoardDao;

public class B01_MainInsert {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		int cnt = -1;
		cnt = dao.InsertDate(new Board(7, "연습중","kim","연습해요",new Date(2021, 1, 26),1));
		if (cnt==-1) {
			System.out.println("게시물 추가 실패");
		} else {
			System.out.println("게시물 등록");
		}

	}

}
