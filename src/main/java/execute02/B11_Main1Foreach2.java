package execute02;

import java.util.List;

import bean.Product;
import dao.ProductDao;

public class B11_Main1Foreach2 {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		List<Product> lists = dao.Foreach2();
		
		for (Product product : lists) {
			String imsi = "";
			imsi += product.getPno() + "\t";
			imsi += product.getPname() + "\t";
			imsi += product.getStock() + "\t";
			imsi += product.getPrice();
			
			System.out.println(imsi);
		}
	}

}
