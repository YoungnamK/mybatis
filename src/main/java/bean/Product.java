package bean;

public class Product {
	private int pno;
	private String pname;
	private int price;
	private int stock;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Product(int pno, String pname, int price, int stock) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", stock=" + stock + "]";
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
