package state;

public class ATM {


	
	private State state;
	
	private State CardStateA;
	private State PINA;
	private State MoneyA;
	
	
	
	public ATM(){
		this.state=null;

		CardStateA = new CardStateA();
		PINA = new PINA();
		MoneyA = new MoneyA();
	}
	

	public void setState(State state) {
		this.state = state;
	}
	public State getState(){
		return state;
	}
	
	
	public void handle() {
		//this.state=CardStateA;
		CardStateA.handle(this);

	}

	
	public void enterPin() {
		//this.state=PINA;
		PINA.enterPin(this);
		
	}

	public void withDrawCash() {
		//this.state=MoneyA;
		MoneyA.withDrawCash(this);
		
	}
	

}
