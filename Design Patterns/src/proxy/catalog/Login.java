package proxy.catalog;

import java.io.File;
import java.util.Scanner;


public class Login implements CatalogInterface{
	private String login = "simon";
	private String password = "password";
	private String incorrect = "not valid login or password";
	private Catalog catalog;
	private File file;
	
	
	public void login(){
		Scanner sc = new Scanner(System.in);
		System.out.println("which folder?");
		String fileToOpen = sc.nextLine();
		listFiles(fileToOpen);

		boolean correct = false;
		while (correct != true){
			System.out.println("enter Login");
			String tempLogin = sc.nextLine();
			System.out.println("enter password");
			String tempPassword = sc.nextLine();
			if (tempLogin.equalsIgnoreCase(login) && tempPassword.equalsIgnoreCase(password)){
				correct = true;
				catalog = new Catalog(fileToOpen);
				sc.close();
			}
			else{
				System.out.println(incorrect);
			}
		}		
	}

	@Override
	public void listFiles(String s) {
		file = new File("c:/"+s);
		if (!file.isDirectory()){
			System.out.println("not a directory");
			System.exit(0);
		}
		
	}

}
