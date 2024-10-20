package hafta2_PassByValue_Classes_Constructors;

public class PassByValue2 {
	public static void main(String[] args) {
		int [] dizi= {2,6,8,6,2};
		degistir(dizi);
		System.out.println(dizi[0]);
	}
	public static void degistir(int[] gelendizi) {
		gelendizi[0]=315;
		
	}
}
