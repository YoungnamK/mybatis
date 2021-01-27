package execute03;

import bean.Album;
import dao.AlbumDao;

public class C01_Main1Insert {

	public static void main(String[] args) {
		AlbumDao dao = new AlbumDao();
		System.out.println("앨범 추가하기");
		int result =-1;
		Album bean = new Album(0, "별 시", "호호호", "김건모", "이수만, 김도훈", "김도훈", "21/01/27", "aa.png", "발라드", "lp,cd", "yes");
		result = dao.InsertData(bean);
		
		if (result ==1) {
			System.out.println("앨범이 추가됐습니다.");
		}
	}

}
