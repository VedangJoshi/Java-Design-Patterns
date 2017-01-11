package strategy;

public class ShoppingCart {
	public PaymentMethod payMethod;
	
	public void setPaymentMethod(PaymentMethod payMethod) {
		this.payMethod = payMethod;
	}
	
	public int chargeMoney() {
		payMethod.makePayment();
		return 1;
	}
}
