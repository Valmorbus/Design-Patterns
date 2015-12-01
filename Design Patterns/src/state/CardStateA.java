package state;

public class CardStateA implements State {

	@Override
	public void handle(ATM atm) {
		atm.setState(this);
		System.out.println("Card is inserted");
		

	}

	@Override
	public void enterPin(ATM atm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDrawCash(ATM atm) {
		// TODO Auto-generated method stub
		
	}

}
