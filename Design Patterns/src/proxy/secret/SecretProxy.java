package proxy.secret;

import java.util.Scanner;

public class SecretProxy implements SecretInterface{
	private String login = "simon";
	private String password = "password";
	private String falseSecret = "not valid login or password";
	private RealSecret realSecret;
	
	
	public void login(){
		Scanner sc = new Scanner(System.in);
		boolean correct = false;
		while (correct != true){
			System.out.println("enter Login");
			String tempLogin = sc.nextLine();
			System.out.println("enter password");
			String tempPassword = sc.nextLine();
			if (tempLogin.equalsIgnoreCase(login) && tempPassword.equalsIgnoreCase(password)){
				correct = true;
				
				System.out.println(showSecret());
				sc.close();
			}
			else{
				System.out.println(falseSecret);
			}
		}	
		
	}

	@Override
	public String showSecret() {
		// TODO Auto-generated method stub
		realSecret = new RealSecret();
		return realSecret.showSecret();
	}

}
