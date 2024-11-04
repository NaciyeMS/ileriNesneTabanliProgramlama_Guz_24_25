package hafta3_AccesModifier_PassByValue_Static_ToString;

public class PassByValue3 {

	 public static void main(String[] args) {
	        BankaHesabi hesap = new BankaHesabi();
	        hesap.bakiye = 500;
	        
	        guncelleBakiye(hesap);
	        System.out.println("Güncellenmiş Bakiye: " + hesap.bakiye);
	        
	        degistirHesap(hesap);
	        System.out.println("Referans Değiştirme Sonrası Bakiye: " + hesap.bakiye);
	    }
	 private static void guncelleBakiye(BankaHesabi hesap) {
	        hesap.bakiye = 1000;  // Mevcut hesap nesnesinin bakiyesini güncelliyoruz
	    }

	    private static void degistirHesap(BankaHesabi hesap) {
	        hesap = new BankaHesabi(); // Yeni bir hesap nesnesi oluşturuyoruz
	        hesap.bakiye = 2000;  // Yeni hesap nesnesine bakiye atanıyor
	    }

}
