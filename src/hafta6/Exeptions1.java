package hafta6;
public class Exeptions1 {
	public static void main(String[] args) {
      bolum3(4,0);   	}
	public static void bolum1(int x,int y) {
		System.out.println(x/y);
	}
	public static void bolum2(int x,int y) {
		if(y==0)
		{System.out.println("bir sayı 0 a bölünemez");}
		else {System.out.println(x/y);}
	}
	public static void bolum3(int x,int y) {
		try {
			System.out.println(x/y);
			System.out.println("try içi görev tamamlandı");
		} catch (ArithmeticException e) {
			System.out.println("Cathe uyarı yazılır");
			System.out.println("bir sayı 0 a bölünmez");
		}
		System.out.println("try sonrası koda devam ediyor mu? ");
	}
}
