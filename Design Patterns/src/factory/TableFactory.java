package factory;

public class TableFactory extends AbstractFactory{
	
	public Furniture createProduct(int lott){
		
		if (lott <= 250 ){
			return new LivingroomTable(0.5f, 0.4f, 0.7f);
		}
		else if (lott > 250 && lott <=500){
			return new LivingroomTable(0.8f, 0.7f,0.5f);
		}
		else if (lott >500 && lott <= 750){
			return new DinnerTable(1.2f, 1f, 0.7f);
		}
		else if (lott >750 && lott <= 1000){
			return new DinnerTable (1.4f, 1f, 0.8f);
		}
		return null;
	}

	

}
