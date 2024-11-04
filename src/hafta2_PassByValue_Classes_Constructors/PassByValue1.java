package hafta2_PassByValue_Classes_Constructors;

public class PassByValue1 {
	 public static void main(String[] args) {
	        int ogrenciNotu = 75;
	        notDegistir(ogrenciNotu);
	        
	        // Değişiklik yapılmadığını görmek için
	        System.out.println("Öğrencinin Orijinal Notu: " + ogrenciNotu);
	    }

	    public static void notDegistir(int not) {
	        not = 90;  // Notu değiştirmeye çalışıyoruz
	        System.out.println("Değiştirilen Not: " + not);
	    }
}
