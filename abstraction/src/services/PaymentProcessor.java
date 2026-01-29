package services;

import payments.Payment;

public class PaymentProcessor {

    public static void processPayment(Payment payment, double amount) {
    	//If payment = UpiPayment - > UpiPayment.makePayment(){}  
        payment.makePayment(amount);
    }
}
