package state;

public class Order {
	public OrderStateInterface order;
	
	public Order() {
		this.order = null;
	}

	public OrderStateInterface getOrder() {
		return order;
	}

	public void setOrder(OrderStateInterface order) {
		this.order = order;
	}
}
