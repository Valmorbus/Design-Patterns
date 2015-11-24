package facade;

import java.util.Scanner;

public class Store {
	private Toy toy;
	private Game game;
	private float payment;
	
	public Store(){
		toy = new Toy(100, "teddybear");
		game = new Game(500, "massgrave attack");
	}
	public float buy(float f ){
		System.out.println("vad vill du köpa? ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.equalsIgnoreCase("toy")){
			payment = checkAvailability(toy);
		}
		else if (s.equalsIgnoreCase("game")){
			payment = checkAvailability(game);
			return 0;
		}
		System.out.println("go through with purchase? cost " + payment);
		s = sc.nextLine();
		if (s.equalsIgnoreCase("yes")){
			System.out.println("you now have " +(f-payment));
			return payment;
		}
			
		else
			return 0;
	}
	
	private float checkAvailability(Product p){
		if(p.isAvailable()){
			System.out.println(p.name() + " is in stock");
			return p.getPrice();
		}
		else{
			System.out.println(p.name() + " is not available");
			return 0;
		}
	}

}
