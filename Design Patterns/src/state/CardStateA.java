package state;

public class CardStateA implements State {

	@Override
	public void CardIsIn(ATM atm) {
		
		System.out.println("Card is inserted");
		atm.setState(atm.getPINA());
		

	}

	@Override
	public void enterPin(ATM atm) {
		// TODO Auto-generated method stub
		
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
