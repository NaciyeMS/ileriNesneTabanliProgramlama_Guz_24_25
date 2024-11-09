package hafta5_5Final;

public class FinalVariableExample {
	   public static void main(String[] args) {
	        final int MAX_AGE = 100;
	        System.out.println("Max yaş: " + MAX_AGE);
	        // MAX_AGE = 120;  
	        // Hata verir, çünkü final değişken tekrar atanamaz.
	    }
}
