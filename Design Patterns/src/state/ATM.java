package state;

public class ATM {


	
	private State state;
	
	private State CardStateA;
	private State PINA;
	private State MoneyA;
	private State NoCardIn;
	
	
	
	public ATM(){
		
		CardStateA = new CardStateA();
		PINA = new PINA();
		MoneyA = new MoneyA();
		NoCardIn = new NoCardIsIn();
		this.state = NoCardIn;
	}
	

	public void setState(State state) {
		this.state = state;
	}
	public State getState(){
		return state;
	}
	
	
	public void CardIsIn() {
		//this.state=CardStateA;
		state.CardIsIn(this);

	}

	
	public void enterPin() {
		//this.state=PINA;
		state.enterPin(this);
		
	}

	public void withDrawCash() {
		//this.state=MoneyA;
		state.withDrawCash(this);
		
	}
	public void NoCardIn(){
		state.NoCardIn(this);
	}


	public State getCardStateA() {
		return CardStateA;
	}




	public State getPINA() {
		return PINA;
	}




	public State getMoneyA() {
		return MoneyA;
	}


	


	public State getNoCardIn() {
		return NoCardIn;
	}


	
	
	

}
