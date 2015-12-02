package observer;

import java.util.Observable;
import java.util.Observer;

public class NewsPaper implements Observer{
	private String name;
	
	public NewsPaper(String name) {
		this.name = name;
		
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + ": " );
		System.out.println(o.toString());
		
	}

}
