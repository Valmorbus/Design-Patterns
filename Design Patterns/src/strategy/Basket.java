package strategy;

public class Basket {
	
	public Basket(Strategy strategy, Product[] product){
		float totalPrice = 0;
		for (Product p : product)
			totalPrice += p.getPrice();
		totalPrice = strategy.doOperation(totalPrice);
		System.out.println(strategy.getClass() + " " + totalPrice);
		
	}

}
