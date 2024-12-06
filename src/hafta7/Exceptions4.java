package hafta7;

import java.util.Scanner;
public class Exceptions4 {
	 public static void main(String[] args) {
	        // Restoran menüsünü tanımla
	        String[] menu = {"Çorba", "Salata", "Kebap", "Tatlı"};
	        // Kullanıcıdan menüden bir seçim yapmasını iste
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Restoran Menüsü:");
	        for (int i = 0; i < menu.length; i++) {
	            System.out.println((i + 1) + ". " + menu[i]);
	        }
	        System.out.print("Menüden bir yemek seçmek için numarasını giriniz: ");
	        int choice = scanner.nextInt();
	        // Seçilen yemeği getir
	        getMenuItem(menu, choice - 1);
	    }

	    public static void getMenuItem(String[] menu, int idx) {
	        try {
	            // Seçilen menü öğesini al
	            String selectedItem = menu[idx];
	            System.out.println("Seçtiğiniz yemek: " + selectedItem);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Hatalı seçim durumu için kullanıcıya bilgi ver
	            System.out.println("Geçersiz bir seçim yaptınız! Lütfen 1 ile " 
	            + menu.length + " arasında bir sayı giriniz.");
	        }
	        System.out.println("Restoran uygulaması çalışmaya devam ediyor.");
	    }
}
