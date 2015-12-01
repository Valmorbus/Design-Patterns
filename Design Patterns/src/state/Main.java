package state;

public class Main {
	

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.NoCardIn();
		atm.CardIsIn();
		atm.enterPin();
		atm.withDrawCash();
	}

}
