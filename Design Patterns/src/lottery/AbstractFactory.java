package lottery;

import java.util.Random;

public abstract class AbstractFactory {
	
	public static Furniture generateWin() {
		AbstractFactory s; 
		Random random = new Random();
		int lott = random.nextInt(1500);
		if (lott <1000)
			s = new TableFactory();
		else 
			s = new BookshelfFactory();
		return s.createProduct(lott);
		}
	
	protected abstract Furniture createProduct(int choise);

}