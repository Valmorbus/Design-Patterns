package state;

public class Main {
	

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		atm.handle();
		atm.enterPin();
		atm.withDrawCash();
	}

}
