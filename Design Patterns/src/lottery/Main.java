package lottery;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lottery l = new Lottery();
		Furniture f = AbstractFactory.generateWin();
		System.out.println(f.toString());
	}

}
