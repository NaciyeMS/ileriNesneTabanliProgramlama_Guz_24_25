package hafta2_PassByValue_Classes_Constructors;

public class Arrays_Metods {
	public static void main(String[] args) {
		int [] isim= {8,5,5,5,56,89,8,8};//diziyi tanımladık
		diziyiEkranaYaz(isim);
	}
	
	public static void diziyiEkranaYaz(int [] x) {
		//for( int w : x) {
			//System.out.println(w);			
		//}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
