package execute03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Album;
import dao.AlbumDao;

public class C07_Main1IfCondition {

	public static void main(String[] args) {
		System.out.println("입력 값이 1이면 작사가(LYRICIST 컬럼)가 '김이나', 이외의 값이면 모든 앨범을 조회");
		AlbumDao dao = new AlbumDao();
		Scanner sc = new Scanner(System.in);
		
		int menu = sc.nextInt();
		String lyricist = "";
		if (menu ==1) {
			lyricist="김이나";
		}else {
			lyricist=null;
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("lyricist", lyricist);
		List<Album> lists = dao.IfCondition(map);		
		for(Album alb : lists ) {
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
