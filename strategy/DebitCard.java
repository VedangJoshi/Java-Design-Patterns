package strategy;

public class DebitCard implements PaymentMethod{

	@Override
	public int makePayment() {
		System.out.println("DebitCard");
		return 0;
	}
}
