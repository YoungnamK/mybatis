package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import bean.Board;

public class BoardDao extends SuperDao{
	private final String namespace="NsBoard.";
	
	public BoardDao() {
		super();
	}

	public List<Board> SelectTopN(int offset, int limit) {
		List<Board> lists = null;
		RowBounds rowBounds = new RowBounds(offset, limit);
		lists = super.sqlSession.selectList(namespace + "SelectTopN", null, rowBounds);
		super.SessionClose();
		return lists;
		}

	public int InsertDate(Board board) {
		int cnt = -1;
		cnt = super.sqlSession.insert(namespace+"InsertData", board);
		super.SessionClose();
		return cnt;
	}

	public int UpdateData(Board board) {
		int cnt = -1;
		cnt = super.sqlSession.update(namespace+"UpdateData", board);
		super.SessionClose();
		return cnt;
	}

	public int DeleteData(int no) {
		int cnt = -1;
		cnt = super.sqlSession.delete(namespace+"DeleteData", no);
		super.SessionClose();
		return cnt;
	}

	public List<Board> SelectAll() {
		List<Board> lists = super.sqlSession.selectList(namespace+"SelectAll");
		super.SessionClose();
		return lists;
	}

	public Board SelectOne(int no) {
		Board board = super.sqlSession.selectOne(namespace+"SelectOne", no);
		super.SessionClose();
		return board;
	}
	
	public List<HashMap<String, Object>> JoinTest() {
		List<HashMap<String, Object>> lists = null;
		lists = super.sqlSession.selectList(namespace+"JoinTest");
		super.SessionClose();
		return lists;
	}

	public List<HashMap<String, Object>> IfJoin(String name) {
		List<HashMap<String, Object>> lists = null;
		lists=super.sqlSession.selectList(namespace+"IfJoin", name);
		super.SessionClose();
		return lists;
	}

	public List<Board> IfCondition(String id) {
		List<Board> lists = null;
		lists = super.sqlSession.selectList(namespace+"IfCondition",id);
		super.SessionClose();
		return lists;
	}

	public List<Board> TrimIf1(Map<String, Object> map) {
		List<Board> lists = null;
		lists = super.sqlSession.selectList(namespace+"TrimIf1", map);
		super.SessionClose();
		return lists;
	}
}
