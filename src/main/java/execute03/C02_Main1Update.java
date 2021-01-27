package execute03;

import bean.Album;
import dao.AlbumDao;

public class C02_Main1Update {

	public static void main(String[] args) {
		AlbumDao dao = new AlbumDao();
		System.out.println("앨범 수정하기");
		int result =-1;
		Album bean = new Album(8, "연인", "soulTree", "박효신", "김이나", "정재일", "21/01/27", "aa.png", "발라드", "lp,cd", "yes");
		result = dao.UpdateData(bean);
		
		if (result ==1) {
			System.out.println("앨범이 수정됐습니다.");
		}
	}

}
