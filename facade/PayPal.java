package facade;

public class PayPal implements PaymentMethod{

	@Override
	public int makePayment() {
		System.out.println("PayPal");
		return 0;
	}
}
