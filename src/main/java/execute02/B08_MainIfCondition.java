package execute02;

import java.util.List;
import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class B08_MainIfCondition {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		System.out.println("1이면 홍길동, 나머지숫자는 전체 게시물을 보여줍니다.");
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		String id = "";
		if (menu==1) {
			id ="hong";
		}else {
			id =null;
		}
		List<Board> lists = dao.IfCondition(id);
		System.out.println("번호\t제목\t작성자\t내용\t게시일자\t조회수");
		for(Board bo : lists) {
			String imsi=bo.getNo()+"\t"+bo.getTitle()+"\t"+bo.getWriter()+"\t"+bo.getContent()+"\t"+bo.getRegdate()+"\t"+bo.getHitcount();
			System.out.println(imsi);	
		}
		sc.close();
	}

}
