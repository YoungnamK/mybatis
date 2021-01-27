package execute;

import java.util.List;

import bean.Member;
import dao.MemberDao;

public class A12_Main1Foreach2 {

	public static void main(String[] args) {
		System.out.println("for each 구문(컬렉션으로 조회하기)");
		MemberDao dao = new MemberDao();
		List<Member> lists = dao.ForEach2();
		for(Member bean : lists) {
			String imsi =bean.getName()+"\t"+bean.getAge()+"\t"+bean.getGender();
			System.out.println(imsi);
		}

	}

}
