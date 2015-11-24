package factory;

public abstract class Furniture {
	float height, width, lenght;
	
	public Furniture(float height, float width, float lenght) {
		super();
		this.height = height;
		this.width = width;
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return "Furniture [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
