package hafta5_4Polymorphism;
public class CashPayment extends Payment{
	 /*Nakit işlemleri için oluşturuldu
	  * parent class= Payment*/
	@Override
	public void processPayment(double amount) {
	    System.out.println("Nakit ödeme yapılıyor: " + amount + " TL");
	    System.out.println("Kasiyere nakit ödeme alındı bildiriliyor...");
	}
}




