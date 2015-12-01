package strategy;

public class QuickDelivery implements Strategy {
	

	@Override
	public float doOperation(float f) {
		float totalPrice = 0;
		totalPrice += f*(1.12f);
		totalPrice += 0.01f;
		return totalPrice;
	}

}
