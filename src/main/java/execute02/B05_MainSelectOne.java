package execute02;

import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class B05_MainSelectOne {

	public static void main(String[] args) {
		System.out.println("조회하려는 글 번호를 입력해주세요.");
		BoardDao dao= new BoardDao();
		Scanner sc= new Scanner(System.in);
		int no = sc.nextInt();
		Board board = dao.SelectOne(no);
		System.out.println(board.toString());

	}

}
