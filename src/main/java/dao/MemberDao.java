package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Member;

public class MemberDao extends SuperDao {
	private final String namespace="NsMember.";
	public MemberDao() {
		super();
	}
	public int InsertDate(Member member) {
		int cnt = -1;
		cnt = super.sqlSession.insert(namespace+"InsertData",member);
		super.SessionClose();
		return cnt;
	}
	public int UpdateData(Member member) {
		int cnt = -1;
		cnt = super.sqlSession.update(namespace+"UpdateData",member);
		super.SessionClose();
		return cnt;
	}
	public int DeleteData(String name) {
		int cnt=-1;
		cnt = super.sqlSession.delete(namespace+"DeleteData", name);
		super.SessionClose();
		return cnt;
	}
	public List<Member> GetMemberList() {
		List<Member> lists = super.sqlSession.selectList(namespace+"GetMemberList");
		super.SessionClose();
		return lists;
	}
	public Member GetMemberByPk(String id) {
		Member member = super.sqlSession.selectOne(namespace+"GetMemberByPk", id);
		super.SessionClose();
		return member;
	}
	public List<Member> GetJoinlist() {
		List<Member> lists=null;
		lists= super.sqlSession.selectList(namespace+"GetJoinList");
		super.SessionClose();
		return lists;
	}
	public List<HashMap<String, Object>> JoinGet3Way() {
		List<HashMap<String, Object>> maplists = null;
		maplists = super.sqlSession.selectList(namespace+"JoinGet3Way");
		super.SessionClose();
		return maplists;
	}
	public List<Member> IfCondition(String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		List<Member> lists = null;
		lists = super.sqlSession.selectList(namespace+"IfCondition", map);
		super.SessionClose();
		return lists;
	}
	

}
