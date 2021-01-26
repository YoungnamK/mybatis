package execute02;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import dao.BoardDao;

public class B07_MainIfJoin {

	public static void main(String[] args) {
		System.out.println("1번이면 홍길동, 2번이면 박휘순, 이외의 숫자는 전체 정보를 출력합니다.");
		BoardDao dao = new BoardDao();
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		String name = "";
		if (menu ==1) {
			name ="홍길동";
		}else if (menu ==2) {
			name ="박휘순";
		}else {
			name = null;
		}
		List<HashMap<String, Object>> lists = dao.IfJoin(name);
		System.out.println("아이디\t이름\t제목\t내용");
		for(HashMap<String, Object> map : lists) {
			String id = (String) map.get("ID");
			String _name = (String) map.get("NAME");
			String title = (String) map.get("TITLE");
			String content = (String) map.get("CONTENT");
			
			String imsi = id+"\t"+_name+"\t"+title+"\t"+content;
			System.out.println(imsi);
		}
		sc.close();
	}

}
