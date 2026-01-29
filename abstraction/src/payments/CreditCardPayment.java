package payments;

public class CreditCardPayment implements Payment {

	@Override 
	public void makePayment(double amount) {
		System.out.println("Payment is done by creditCard") ;
		System.out.println("The amount is " + amount);
	}		
}
	