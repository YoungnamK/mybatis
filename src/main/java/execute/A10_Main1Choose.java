package execute;

import java.util.List;
import java.util.Scanner;

import bean.Product;
import dao.ProductDao;

public class A10_Main1Choose {

	public static void main(String[] args) {
		System.out.println("동적 sql(choose 구문)");
		System.out.println("2배인상 가격 (1), 절반가격(2), 가격의 30%(3)"); 
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		String param = null;
		if (menu ==1) {
			param="DOUBLE";
		} else if(menu==2) {
			param="HALF";
		}else {
			param="ETC";
		}
		
		ProductDao dao = new ProductDao();
		List<Product> lists = dao.Choose(param);
		System.out.println("조회된 건수 : "+lists.size());
		
		for(Product product:lists) {
			String imsi = product.getPno()+"\t"+product.getPname()+"\t"+product.getStock()+"\t"+product.getPrice();
			System.out.println(imsi);
		}
		
	}

}
