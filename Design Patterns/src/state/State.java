package state;

public interface State {
	public void CardIsIn(ATM atm);
	public void NoCardIn(ATM atm);
	public void enterPin(ATM atm);
	public void withDrawCash(ATM atm);
	
}
