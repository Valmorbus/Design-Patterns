package factory;

public class smallBookShelf extends Bookshelf {

	public smallBookShelf(float height, float width, float lenght, int numberOfBooks) {
		super(height, width, lenght, numberOfBooks);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "smallBookShelf [height=" + height + ", width=" + width + ", lenght=" + lenght + ", numberOfBooks="
				+ numberOfBooks + "]";
	}

}
