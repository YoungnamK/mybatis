package dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SuperDao {
	//맵 설정 파일 : mybatis관련 설정 파일
	private String mapConfigfile = null;
	private SqlSessionFactory ssf =null;
	protected SqlSession sqlSession = null;
	//SqlSession : sql문장을 이용해 데이터베이스에게 요청하는 객체
	public SuperDao() {
		this.mapConfigfile = "mybatis/mapconfigfile.xml";
		this.SessionOpenStream();
	}
	public void SessionClose() {
		//sqlSession을 종료해주는 메소드
		if(this.sqlSession!=null) {this.sqlSession.close();}
	}
	private void SessionOpenStream() {
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(this.mapConfigfile);
			this.ssf = new SqlSessionFactoryBuilder().build(inputStream);
			this.sqlSession = this.ssf.openSession(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream!=null) {inputStream.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	
	}
}
