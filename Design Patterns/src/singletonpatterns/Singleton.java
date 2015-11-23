package singletonpatterns;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton(){
		System.out.println("original Singleton");
	}
	
	public static Singleton getInstance(){
		if (singleton == null)
			singleton = new Singleton();
		return singleton;		
	}

}
