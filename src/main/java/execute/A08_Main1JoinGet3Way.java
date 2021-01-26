package execute;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import dao.MemberDao;

public class A08_Main1JoinGet3Way {
	public static void main(String[] args) {
		System.out.println("다중 조인하기");
		MemberDao dao = new MemberDao();
		String imsi = "이름\t과일명\t단가\t수량\t총판매액";
		System.out.println(imsi);
	
		List<HashMap<String, Object>> maplists = dao.JoinGet3Way();
		for(HashMap<String, Object> map : maplists) {
			// 주의사항 ! DB에서 모든 컬럼의 이름이 대문자로 설정됩니다. 
			String name = (String) map.get("NAME");
			String pname = (String) map.get("PNAME");
			
			BigDecimal price = (BigDecimal) map.get("PRICE");
			BigDecimal qty = (BigDecimal) map.get("QTY");
			BigDecimal amount = (BigDecimal) map.get("AMOUNT");
			
			String temp = "";
			temp += name+"\t"+pname+"\t"+price+"\t"+qty+"\t"+amount;
			System.out.println(temp);
		}
	
	
	
	}
}
