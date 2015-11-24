package factory;

public abstract class Table extends Furniture{
	
	public Table(float height, float width, float lenght) {
		super(height, width, lenght);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Table [height=" + height + ", width=" + width + ", lenght=" + lenght + "]";
	}
	
	
	
	

}
