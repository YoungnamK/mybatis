package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Product;

public class ProductDao extends SuperDao {
	private final String namespace = "NsProduct.";
	public ProductDao() {
		super();
	}

	public List<Product> Choose(String param) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("somevalue", param);
		
		List<Product> lists = null;
		lists = super.sqlSession.selectList(namespace+"Choose", map);
		super.SessionClose();
		return lists;
	}

	public List<Product> Foreach1() {
		String[]item = {"사과","배"};
		List<Product> lists = null;
		lists=super.sqlSession.selectList(namespace+"Foreach1", item);
		super.SessionClose();
		return lists;
	}

	public List<Product> Foreach2() {
		List<String> proname = new ArrayList<String>();
		proname.add("사과");
		proname.add("배");
		List<Product> lists = null;
		lists = super.sqlSession.selectList(namespace+"Foreach2", proname);
		super.SessionClose();
		return lists;
	}




}
