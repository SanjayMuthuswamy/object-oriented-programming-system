package payments;

public class CashPayment implements Payment {
	public void makePayment(double amount) {
		System.out.println("Payment is viva cash") ;
		System.out.println("The payed amount  is " + amount + "$");
	}
	
}
