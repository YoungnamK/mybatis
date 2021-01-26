package execute02;

import java.util.HashMap;
import java.util.List;

import dao.BoardDao;

public class B06_MainJoinTest {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<HashMap<String, Object>> maplists = dao.JoinTest();
		System.out.println("아이디\t이름\t제목\t내용");
		for(HashMap<String, Object> mem : maplists) {
			String id= (String) mem.get("ID");
			String name= (String) mem.get("NAME");
			String title= (String) mem.get("TITLE");
			String content= (String) mem.get("CONTENT");
			
			System.out.println(id+"\t"+name+"\t"+title+"\t"+content);
		}

	}

}
