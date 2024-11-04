package hafta1_methods_overloadings_varargs;

public class Varargs {
	 public static void main(String[] args) {
	        // VARARGS ile sınav notlarını toplama
	        topla(85, 90, 78);           // Üç sınav notu
	        topla(65, 70);               // İki sınav notu
	        topla(90, 85, 75, 80, 95);   // Beş sınav notu
	    }

	    public static void topla(int... notlar) {
	        int toplam = 0;
	        for (int not : notlar) {
	            toplam += not;
	        }
	        
	        System.out.println("Toplam Sınav Puanı: " + toplam);
	    }
}
