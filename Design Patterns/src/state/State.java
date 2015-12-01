package state;

public interface State {
	public void handle(ATM atm);
	public void enterPin(ATM atm);
	public void withDrawCash(ATM atm);
	
}
