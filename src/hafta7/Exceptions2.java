package hafta7;
import java.util.Scanner;
public class Exceptions2 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir telefon numarası giriniz (sadece rakam): ");
        String phoneNumber = scanner.nextLine();
        convertPhoneNumberToInt(phoneNumber);
	}
	public static void convertPhoneNumberToInt(String phoneNumber) {
            // Telefon numarasını tam sayıya çevir
            int intPhoneNumber = Integer.valueOf(phoneNumber);
            System.out.println("Dönüştürülen Telefon Numarası: " + intPhoneNumber);
    }
}
