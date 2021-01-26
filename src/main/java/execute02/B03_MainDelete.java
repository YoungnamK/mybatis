package execute02;

import dao.BoardDao;

public class B03_MainDelete {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		int cnt =-1;
		int no = 7;
		cnt = dao.DeleteData(no);
		
		if (cnt ==1) {
			System.out.println("삭제완료");
		}else if(cnt ==-1) {
			System.out.println("삭제 실패");
		}
			
	}

}
