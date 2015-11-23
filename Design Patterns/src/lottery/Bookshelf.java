package lottery;

public abstract class Bookshelf extends Furniture{
	int numberOfBooks;

	public Bookshelf(float height, float width, float lenght, int numberOfBooks) {
		super(height, width, lenght);
		this.numberOfBooks = numberOfBooks;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bookshelf [numberOfBooks=" + numberOfBooks + ", height=" + height + ", width=" + width + ", lenght="
				+ lenght + "]";
	}
	
	
	
	
	
	
}
