package facade;

public class ShoppingCart {
	public PaymentMethod payMethod;
	
	public void setPaymentMethod(PaymentMethod payMethod) {
		this.payMethod = payMethod;
		System.out.println("Payment method set");
	}
	
	public int chargeMoney() {
		payMethod.makePayment();
		System.out.println("Charging amount using payment method");
		return 1;
	}
}
