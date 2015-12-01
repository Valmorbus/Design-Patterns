package state;

import java.util.Scanner;

public class MoneyA implements State {
	
	@Override
	public void CardIsIn(ATM atm) {}
	

	@Override
	public void enterPin(ATM atm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDrawCash(ATM atm) {
		atm.setState(this);
		System.out.println("hur mycket vill du ta ut");
		int i = 0;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		if(i > 500 ){
			System.out.println("för mycket");
		}
		else System.out.println("withdrawn " + i);
		
	}


	@Override
	public void NoCardIn(ATM atm) {
		// TODO Auto-generated method stub
		
	}

}
