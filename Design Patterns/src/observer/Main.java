package observer;

public class Main {

	public static void main(String[] args) {
		Stock stock = new Stock("kuk", 255.5);
		NewsPaper np = new NewsPaper("Wallstreet");
		Website wsite = new Website("PornHub"); 
		
		stock.addObserver(np);
		stock.addObserver(wsite);
		
		System.out.println(stock.toString());
		
		stock.setValue(6000);
		stock.setValue(300);
		
		
	}

}
