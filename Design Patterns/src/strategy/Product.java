package strategy;

public class Product {
	private float price;
	private int productID;
	public Product(float price, int productID) {
		super();
		this.price = price;
		this.productID = productID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", productID=" + productID + "]";
	}
	
	

}
