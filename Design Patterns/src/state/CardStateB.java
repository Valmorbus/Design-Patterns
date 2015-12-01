package state;

public class CardStateB implements State {

	@Override
	public void handle(ATM atm) {
		atm.setState(this);
		System.out.println("insert card");
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
