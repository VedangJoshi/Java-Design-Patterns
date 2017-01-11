package state;

public class MakePayment implements OrderStateInterface {

	@Override
	public void executeState(Order order) {
		System.out.println("Making payment");
		order.setOrder(this);
	}
}
