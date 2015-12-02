package observer;

import java.util.Observable;
import java.util.Observer;

public class Website implements Observer{
	
	private String name;
	
	

	public Website(String name) {
		super();
		this.name = name;
	}



	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + ": " );
		System.out.println(o.toString());
		
	}

}
