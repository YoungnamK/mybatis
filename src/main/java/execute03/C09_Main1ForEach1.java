package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C09_Main1ForEach1 {

	public static void main(String[] args) {
		AlbumDao dao = new AlbumDao();
		List<Album> lists = dao.Foreach1();
		System.out.println("김이나, 최갑원 작사 앨범만 foreach로 조회");
		for (Album alb : lists) {
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
