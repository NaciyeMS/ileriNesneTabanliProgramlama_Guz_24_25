package hafta2_PassByValue_Classes_Constructors;

public class PassByValue2 {
	 public static void main(String[] args) {
	        int[] stoklar = {50, 30, 20, 15}; // Mağazadaki ürün stok miktarları
	        stokGuncelle(stoklar);
	        
	        // İlk ürünün güncellenmiş stok miktarını görmek için
	        System.out.println("İlk ürünün stok miktarı: " + stoklar[0]);
	    }

	    public static void stokGuncelle(int[] stokDizisi) {
	        stokDizisi[0] = 100;  // İlk ürünün stok miktarını güncelliyoruz
	    }
	//nonprimitive : String dizi object
}
