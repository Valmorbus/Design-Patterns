package state;

public class NoCardIsIn implements State {

	@Override
	public void CardIsIn(ATM atm) {
		System.out.println("No Card is in");
		

	}

	@Override
	public void enterPin(ATM atm) {
		System.out.println("No Card is in");

	}

	@Override
	public void withDrawCash(ATM atm) {
		System.out.println("No Card is in");

	}

	@Override
	public void NoCardIn(ATM atm) {
		System.out.println("No Card is in");
		atm.setState(atm.getCardStateA());
		
	}

}
