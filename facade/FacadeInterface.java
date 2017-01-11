package facade;

public class FacadeInterface {

	public void processOrder(String sku) {
		DebitCard debit = new DebitCard();
		ShoppingCart cart = new ShoppingCart();
		Inventory inventory = new Inventory();
		
		if(inventory.checkInventory(sku) >=1 ) {
			cart.setPaymentMethod(debit);
			cart.chargeMoney();			
		};
	}
}
