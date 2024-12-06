package hafta7;

import java.util.Scanner;

public class Exceptions3 {
public static void main(String[] args) {
	// Kullanıcıdan bir kullanıcı adı al
    Scanner scanner = new Scanner(System.in);
    System.out.print("Lütfen kullanıcı adınızı giriniz: ");
    String username = scanner.nextLine();
    // Kullanıcı adından belirli bir karakteri seçmeye çalış
    getCharacter(username, 10);
}
	public static void getCharacter(String username, int idx) {
		 try {
	            // Belirtilen indeksteki karakteri al
	         char selectedChar = username.charAt(idx);
	         System.out.println("Kullanıcı adının " + (idx + 1) + ". karakteri: " + selectedChar);
	        } catch (StringIndexOutOfBoundsException e) {
	         // Hatalı indeks durumu için kullanıcıya bilgi ver
	        System.err.println("Girilen kullanıcı adı yeterince uzun değil! Lütfen en az " 
	         + (idx + 1) + " karakter içeren bir kullanıcı adı giriniz.");
	            System.err.println("Hata Detayı: " + e.getMessage());
	        }
	        System.out.println("Uygulama çalışmaya devam ediyor.");
	}
}
