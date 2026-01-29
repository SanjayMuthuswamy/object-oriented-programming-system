package main;


import payments.CreditCardPayment;
import payments.UpiPayment;
import payments.Payment;
import payments.CashPayment; 

import services.PaymentProcessor;  //Services -> calls the actual process implemented function(s).

public class Main {

    public static void main(String[] args) {

        Payment payment1 = new CreditCardPayment();
        PaymentProcessor.processPayment(payment1, 1000);

        Payment payment2 = new UpiPayment();
        PaymentProcessor.processPayment(payment2, 500);
        
        Payment payment3 = new CashPayment() ;
        PaymentProcessor.processPayment(payment3, 4000);
    }
}
