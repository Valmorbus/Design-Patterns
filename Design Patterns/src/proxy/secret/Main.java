package proxy.secret;

public class Main {

	public static void main(String[] args) {
		SecretInterface sp = new SecretProxy();
		sp.showSecret();

	}

}
