package execute02;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class B09_MainCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println( "회원 테이블에서 나이가 30이하이면 \"'b', 50이하이면 'mb', 이외에는 'ob'라고 표현하는 동적 sql 구문을 만들어 보세요." );
		MemberDao dao = new MemberDao();	
		
		List<HashMap<String, Object>> maplists = dao.CastStatement() ;
		
		System.out.println( "조회된 건수 : " + maplists.size() );

		for(HashMap<String, Object> map : maplists) {
			// 주의 사항으로 모든 컬럼이 대문자로 설정이 됩니다.
			String id = (String)map.get("ID") ;
			String name = (String)map.get("NAME") ;
			
			BigDecimal age = (BigDecimal)map.get("AGE");

			String gender = (String)map.get("GENDER") ;
			String result = (String)map.get("RESULT") ;
			
			String temp = "" ;
			temp += id + "\t" + name + "\t" + age + "\t" + gender + "\t" + result + "\t" ;  
			System.out.println(temp); 
		}		
		scan.close(); 
	}
}