package state;

public class StateDemo {

	public static void main(String[] args) {
		Order order = new Order();
		ValidatePayMethod valPayMethod = new ValidatePayMethod();
		valPayMethod.executeState(order);
		
		CheckInventory chkInv = new CheckInventory();
		chkInv.executeState(order);
		
		MakePayment mkPay = new MakePayment();
		mkPay.executeState(order);
	}
}
