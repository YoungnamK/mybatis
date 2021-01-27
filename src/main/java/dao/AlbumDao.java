package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import bean.Album;
import myinterface.AlbumMapperInterface;

public class AlbumDao extends SuperDao {
	//매퍼 인터페이스를 사용하므로, 네임스페이스를 명시하지 않음
	AlbumMapperInterface ami = null;
	
	public AlbumDao() {
		this.ami= super.sqlSession.getMapper(AlbumMapperInterface.class);
	}

	public int InsertData(Album bean) {
		int cnt = this.ami.InsertData(bean);
		super.SessionClose();
		return cnt;
	}

	public int UpdateData(Album bean) {
		int cnt = this.ami.UpdateData(bean);
		super.SessionClose();
		return cnt;
	}

	public int DeleteData(int id) {
		int cnt = this.ami.DeleteData(id);
		super.SessionClose();
		return cnt;
	}

	public List<Album> GetDataList() {
		List<Album> lists = this.ami.GetDataList();
		super.SessionClose();
		return lists;
	}

	public Album GetAlbumByPk(int id) {
		Album album = this.ami.GetAlbumByPk(id);
		super.SessionClose();
		return album;
	}

	public List<Album> SelectTopN(int offset, int limit) {
		RowBounds rb = new RowBounds(offset, limit);
		List<Album> lists = this.ami.SelectTopN(rb);
		super.SessionClose();
		return lists;
	}

	public List<Album> IfCondition(Map<String, String> map) {
		List<Album> lists = this.ami.IfCondition(map);
		super.SessionClose();
		return lists;
	}

	public List<Album> Choose(Map<String, String> map) {
		List<Album> lists = this.ami.Choose(map);
		super.SessionClose();
		return lists;
	}

	public List<Album> Foreach1() {
		String[]item = {"김이나", "최갑원"};
		List<Album>lists = null;
		lists = this.ami.Foreach1(item);
		super.SessionClose();
		return lists;
	}

	public List<Album> Foreach2() {
		List<String> somelists = new ArrayList<String>();
		somelists.add("김이나");
		somelists.add("최갑원");
		List<Album>lists = null;
		lists = this.ami.Foreach2(somelists);
		super.SessionClose();
		return lists;
	}

}
