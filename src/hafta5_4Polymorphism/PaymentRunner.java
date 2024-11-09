package hafta5_4Polymorphism;

public class PaymentRunner {
	public static void main(String[] args) {		   
	Payment payment1 = new Payment();
	DebitCardPayment payment2 = new DebitCardPayment();
	CashPayment payment3 = new CashPayment();
	CreditCardPayment payment4 = new CreditCardPayment();
		    
	payment1.processPayment(150.0); 
	payment2.processPayment(75.0);  
	payment3.processPayment(50.0);  
	payment4.processPayment(50.0);  
	}
}

