package proxy.secret;

public class RealSecret implements SecretInterface{
	
	private final String SECRET = "j�ttehemligt";
	public RealSecret(){
		
	}

	@Override
	public String showSecret() {
		// TODO Auto-generated method stub
		return SECRET;
	}

}
