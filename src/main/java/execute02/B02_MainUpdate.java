package execute02;

import java.sql.Date;

import bean.Board;
import dao.BoardDao;

public class B02_MainUpdate {
	public static void main(String[] args) {
		System.out.println("게시물 1건 수정하기");
		BoardDao dao = new BoardDao();
		int cnt = -1;
		cnt= dao.UpdateData(new Board(7,"수정","sim","수정하기",new Date(2021, 01, 25),5));
		if (cnt==-1) {
			System.out.println("수정 실패");
		}else {
			System.out.println("수정 완료");
		}
	
	}

}
