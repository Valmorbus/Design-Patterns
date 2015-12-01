package strategy;

public class ExclusiveDelivery implements Strategy {

	@Override
	public float doOperation(float f) {
		f *= 0.95f;
		f+=10;
		f+=12;
		return f;
	}

}
