package proxy.secret;

public class RealSecret implements SecretInterface{
	
	private final String SECRET = "j�ttehemligt";
	public RealSecret(){
		
	}

	@Override
	public void showSecret() {
		// TODO Auto-generated method stub
		System.out.println(SECRET);
	}
	
	

}
