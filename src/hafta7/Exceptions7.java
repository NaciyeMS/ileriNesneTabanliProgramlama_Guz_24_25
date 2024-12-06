package hafta7;

public class Exceptions7 {
	public static void main(String[] args) {
        // Geçerli bir bakiye
        checkAccountBalance(1500);
        // Geçersiz bir bakiye (negatif değer)
        checkAccountBalance(-500);
    }
    //Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir.
    // try-catch kullanmazsiniz.Burda programin durmasi kesinlikle isteniyordur.
    public static void checkAccountBalance(double balance) {
        // Hesap bakiyesini kontrol et
        if (balance < 0) {
            // Geçersiz bir bakiye için hata fırlat
            throw new IllegalArgumentException("Hesap bakiyesi negatif olamaz: "
            + balance);
        } else {
            System.out.println("Hesap bakiyesi: " + balance + " TL");
        }
    }
}
