package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C09_Main1Foreach2 {

	public static void main(String[] args) {
		AlbumDao dao = new AlbumDao();
		List<Album> lists = dao.Foreach2();
		
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
