package lottery;

public class BookshelfFactory extends AbstractFactory {

	@Override
	protected Furniture createProduct(int choise) {
		
		if (choise > 1000 && choise <=1250)
			return new LargeBookshelf(0.7f, 1.5f, 2.0f, 50);
		else if (choise >1250 && choise <= 1500)
			return new smallBookShelf(0.4f, 1.0f, 1.0f, 25);
		
		return null;
	}

}
