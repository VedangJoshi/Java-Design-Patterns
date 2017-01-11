package state;

public class CheckInventory implements OrderStateInterface {

	@Override
	public void executeState(Order order) {
		System.out.println("Checkinf inventory levels");
		order.setOrder(this);
	}
}
