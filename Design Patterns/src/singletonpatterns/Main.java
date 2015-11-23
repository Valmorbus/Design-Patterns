package singletonpatterns;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Singleton.getInstance();
		EnumSingleton.INSTANCE.run();
		Multiton.getInstance(1);
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Multiton.getInstance(1).run(s);
		Multiton.getInstance(2);
		Multiton.getInstance(2).run("2nd");
		

	}

}
