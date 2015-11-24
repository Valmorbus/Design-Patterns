package proxy.secret;

public class RealSecret implements SecretInterface{
	
	private final String SECRET = "jättehemligt";
	public RealSecret(){
		
	}

	@Override
	public void showSecret() {
		// TODO Auto-generated method stub
		System.out.println(SECRET);
	}
	
	

}
