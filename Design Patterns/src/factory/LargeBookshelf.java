package factory;

public class LargeBookshelf extends Bookshelf {

	public LargeBookshelf(float height, float width, float lenght, int numberOfBooks) {
		super(height, width, lenght, numberOfBooks);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LargeBookshelf [height=" + height + ", width=" + width + ", lenght=" + lenght + ", numberOfBooks="
				+ numberOfBooks + "]";
	}

}
