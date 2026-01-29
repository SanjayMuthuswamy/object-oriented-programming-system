package payments;

public class UpiPayment implements Payment {
	@Override 
	public void makePayment(double amount) {
		System.out.println("Payment is done by UPI mode") ;
		System.out.println("The amount is " + amount);
	}
}
