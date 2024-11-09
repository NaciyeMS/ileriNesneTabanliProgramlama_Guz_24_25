package hafta5_4Polymorphism;
public class DebitCardPayment extends Payment {
	/*Banka kartı işlemleri için oluşturuldu
	 * parent class ı Payment*/
	@Override
	public void processPayment(double amount) {
	    System.out.println("Banka kartı ile ödeme yapılıyor: " + amount + " TL");
	    System.out.println("Banka hesabındaki bakiye kontrol ediliyor...");
	}
}

