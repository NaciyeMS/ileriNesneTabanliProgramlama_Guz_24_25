package hafta2_PassByValue_Classes_Constructors;

public class EvRunner {

	public static void main(String[] args) {
		Kapi k1=new Kapi();
		k1.hangiYoneAcilir();
		Kapi k2=new Kapi(3, 7, "kahverengi", "sol");
				k2.hangiYoneAcilir();

	}

}
