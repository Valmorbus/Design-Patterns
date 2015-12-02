package observer;

import java.util.Observable;

public class Stock extends Observable {

	private String name;
	private double value;

	public Stock(String name, double value) {
		super();
		this.name = name;
		this.value = value;
		System.out.println(this.toString());
	}

	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers();
	}

	public double getValue() {
		return value;
		
	}

	public void setValue(double value) {
		this.value = value;
		setChanged();
		notifyObservers();
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", value=" + value + "]";
	}


}
