package state;

public class ValidatePayMethod implements OrderStateInterface {

	@Override
	public void executeState(Order order) {
		System.out.println("Validating Paymeny method");
		order.setOrder(this);
	}
}
