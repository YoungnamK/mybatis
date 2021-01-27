package execute02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class B12_Main1TrimIf1 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) 모든 사원 조회 (2) 남자만 조회 (3) 나이가 40이상 인 남자 (4) 나이가 40이상");
		int menu = sc.nextInt();
		final int AGE = 40;
		Map<String, Object> map = new HashMap<String, Object>();
		String gender= "";
		int age =0;
		if (menu == 1) {
		} else if (menu == 2) {
			gender="남자";
			map.put("gender", gender);
		} else if (menu == 3) {
			gender="남자";
			map.put("gender", gender);
			age= AGE;
			map.put("age", age);
		} else if (menu == 4) {
			age= AGE;
			map.put("age", age);
		} else {
			System.exit(0);
		}
		
		List<Member> lists = dao.TrimIf1(map);
		
		for (Member member : lists) {
			String imsi = "";
			imsi+=member.getId()+"\t";
			imsi+=member.getName()+"\t";
			imsi+=member.getAge()+"\t";
			imsi+=member.getGender()+"\t";
			System.out.println(imsi);
		}
		
	}

}
