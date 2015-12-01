package strategy;

public class Shop {
	Product p1 = new Product(9.5f, 8233);
	Product p2 = new Product(39.9f, 5778);
	Product p3 = new Product(12.5f, 5178);
	Product[] pArray = {p1,p2,p3};
	Product[] pArray2 = {p1,p2,p3};
	
	public void checkOut(){
		
		Basket b = new Basket(new ExclusiveDelivery(), pArray);
		
		b = new Basket(new QuickDelivery(), pArray2);
		
		
				
		
	}

}
