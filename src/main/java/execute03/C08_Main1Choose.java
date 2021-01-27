package execute03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Album;
import dao.AlbumDao;

public class C08_Main1Choose {

	public static void main(String[] args) {
		// 입력 값이 1이면 작사가가 '김이나'인 앨범들을, 2이면 작사가가 '최갑원'인 앨범들을, 이외의 값이면 모든 앨범을 조회해 보세요.
		System.out.println("1이면 작사가가 '김이나'인 앨범들을, 2이면 작사가가 '최갑원'인 앨범들을, 이외의 값이면 모든 앨범을 조회");
		AlbumDao dao = new AlbumDao();
		String lyricist="";
		Scanner sc= new Scanner(System.in);
		int menu = sc.nextInt();
		
		if (menu ==1) {
			lyricist="김이나";
		} else if(menu==2) {
			lyricist="최갑원";
		} else {
			lyricist = null;
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("lyricist", lyricist);
		List<Album> lists = dao.Choose(map);
		
		for(Album alb :lists) {
			String imsi = "";
			imsi += alb.getId()+"\t";
			imsi += alb.getAlbumname()+"\t";
			imsi += alb.getSong()+"\t";
			imsi += alb.getWriterdate()+"\t";
			imsi += alb.getLyricist()+"\t";

			System.out.println(imsi);
		}
	
	}

}
