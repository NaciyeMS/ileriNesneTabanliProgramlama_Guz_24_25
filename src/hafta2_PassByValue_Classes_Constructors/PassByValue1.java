package hafta2_PassByValue_Classes_Constructors;

public class PassByValue1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int giden=5;
		degistir(giden);
		System.out.println(giden);
	}
	public static void degistir(int gelen) {
		gelen=12;
	}
}
