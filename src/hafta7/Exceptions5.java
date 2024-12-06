package hafta7;
public class Exceptions5 {
	 public static void main(String[] args) {
	        int[] grades = {85, 90, 78};
	        int divisor = 0;
	        int index = 5;
	        // Notları kontrol et ve ortalamayı hesapla
	        calculateAverage(grades, index, divisor);
	    }
	    public static void calculateAverage(int[] grades, int idx, int divisor) {
	        try {
	            // Bölme işlemi ve diziden eleman alma
	            int selectedGrade = grades[idx];
	            int average = selectedGrade / divisor;
	            System.out.println("Seçilen not: " + selectedGrade);
	            System.out.println("Ortalama: " + average);

	        } catch (ArithmeticException e) {
	            // Bölme hatası durumunda
	            System.out.println("Bölme işlemi hatalı: Sıfıra bölme yapmayınız! " 
	            + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Geçersiz dizin hatası durumunda
	            System.out.println("Hatalı indeks kullanımı: Bu indeks dizide mevcut değil! " + e.getMessage());
	        }
	    }
	}

