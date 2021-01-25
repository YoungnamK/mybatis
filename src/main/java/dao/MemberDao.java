package dao;

import java.util.List;

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

}
