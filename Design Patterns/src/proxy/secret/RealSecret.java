package proxy.secret;

public class RealSecret implements SecretInterface{
	
	private final String SECRET = "jättehemligt";
	public RealSecret(){
		
	}

	@Override
	public String showSecret() {
		// TODO Auto-generated method stub
		return SECRET;
	}

}
