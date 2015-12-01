package state;

import java.util.Scanner;

public class PINA implements State {
	

	@Override
	public void handle(ATM atm) {
		
		

	}

	@Override
	public void enterPin(ATM atm) {
		atm.setState(this);
		System.out.println("enter pin");
		
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		if (pin == 4567){
			System.out.println("pin is correct");
		
		}
		
	}

	@Override
	public void withDrawCash(ATM atm) {
		// TODO Auto-generated method stub
		
	}

}
