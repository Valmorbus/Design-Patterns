package state;

import java.util.Scanner;

public class PINA implements State {
	

	@Override
	public void CardIsIn(ATM atm) {
		
		

	}

	@Override
	public void enterPin(ATM atm) {
		
		System.out.println("enter pin");
		
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		if (pin == 4567){
			System.out.println("pin is correct");
		
		}
		atm.setState(atm.getMoneyA());
		
	}

	@Override
	public void withDrawCash(ATM atm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoCardIn(ATM atm) {
		// TODO Auto-generated method stub
		
	}

}
