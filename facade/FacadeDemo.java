package facade;

public class FacadeDemo {

	public static void main(String[] args) {
		FacadeInterface orderProcessor = new FacadeInterface();
		orderProcessor.processOrder("Cellphone_1");
	}
}
