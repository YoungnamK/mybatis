package execute02;

import java.util.List;

import bean.Board;
import dao.BoardDao;

public class B04_MainSelectAll {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> lists = null;
		lists = dao.SelectAll();
		System.out.println("번호\t제목\t작성자\t내용\t게시일자\t조회수");

		for(Board bo : lists){
			String imsi=bo.getNo()+"\t"+bo.getTitle()+"\t"+bo.getWriter()+"\t"+bo.getContent()+"\t"+bo.getRegdate()+"\t"+bo.getHitcount();
			System.out.println(imsi);
		}
	}

}
