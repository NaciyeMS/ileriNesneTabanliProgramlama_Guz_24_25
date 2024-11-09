package hafta5_4Polymorphism;
public class CreditCardPayment extends Payment {
	 /*Kredi kartı işlemleri için oluşturuldu
	  * parent class= Payment*/
	 @Override
	 public void processPayment(double amount) {
	     System.out.println("Kredi kartı ile ödeme yapılıyor: " + amount + " TL");
	     System.out.println("Kredi kartı doğrulama ve işlem onayı yapılıyor...");
	 }	
}

