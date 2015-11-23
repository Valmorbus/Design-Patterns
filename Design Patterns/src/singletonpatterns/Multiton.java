package singletonpatterns;
import java.util.HashMap;

public class Multiton {
	private Multiton(){
		
	}
	private static HashMap<Integer, Multiton> instance = new HashMap<Integer, Multiton>();
	
	public static Multiton getInstance(int key){
		Multiton result = instance.get(key);
		if (result == null){
			Multiton multiton = new Multiton();
			instance.put(key, multiton);
			
			result = multiton;
		}
		return result;
	}

	public void run(String s) {
		System.out.println("multiton " + s);
	}
	
}
