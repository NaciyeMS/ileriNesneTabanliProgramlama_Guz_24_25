package hafta1_methods_overloadings_varargs;

public class Overloading_Metod {
	 public static void main(String[] args) {
		 /*
		 Burada hesapla metodu, ürünlerin fiyatlarını 
		 farklı parametre kombinasyonlarına göre toplamak
		  için overload edilmiştir.*/
	        // Metod overloading ile fiyat hesaplama
	        hesapla(100, 200);           // İki ürünün fiyatını topla
	        hesapla(150, 300, 100);      // Üç ürünün fiyatını topla
	        hesapla(250, 15.5);          // Ürünün fiyatını ve kargo ücretini topla
	        hesapla(12.5, 8.3);          // İki indirimli ürünün fiyatını topla
	        hesapla(300, 0.18);          // Ürün fiyatı ve KDV oranını hesapla
	    }

	    public static void hesapla(double fiyat, double kdvOrani) { // KDV ile fiyat hesapla
	        System.out.println("Toplam Fiyat (KDV Dahil): " + (fiyat + (fiyat * kdvOrani)));
	    }

	    public static void hesapla(int fiyat, double kargo) { // Fiyat ve kargo ücreti topla
	        System.out.println("Toplam Fiyat (Kargo Dahil): " + (fiyat + kargo));
	    }

	    public static void hesapla(int fiyat1, int fiyat2) { // İki ürün fiyatı topla
	        System.out.println("Toplam Fiyat: " + (fiyat1 + fiyat2));
	    }

	    public static void hesapla(int fiyat1, int fiyat2, int fiyat3) { // Üç ürün fiyatı topla
	        System.out.println("Toplam Fiyat: " + (fiyat1 + fiyat2 + fiyat3));
	    }
	    
}
