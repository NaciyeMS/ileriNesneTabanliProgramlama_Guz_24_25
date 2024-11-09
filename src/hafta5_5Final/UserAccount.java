package hafta5_5Final;

public class UserAccount extends Account{
	@Override
    public void displayAccountType() {
        System.out.println("Hesap türü: Kullanıcı Hesabı");
    }
	// @Override
    // public void login() {
    //     System.out.println("Özel bir giriş işlemi.");
    // }  // Hata verir, çünkü login metodu final olarak tanımlandı.
}
