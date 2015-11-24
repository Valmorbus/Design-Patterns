package facade;

public class Game implements Product{
	private float price;
	private String name;
	
	public Game(float price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public Product ship() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAvailable() {
		return false;
		// TODO Auto-generated method stub
		
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
