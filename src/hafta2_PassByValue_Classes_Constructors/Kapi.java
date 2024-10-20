package hafta2_PassByValue_Classes_Constructors;

public class Kapi {
	/*ÖZELLLİKLERi
	 * en  boy rengi acilisyonu
	 * EYLEM
	 * Eğer acilisyonu "sağ" EY "Bu kapı sağa açılır"
	 * Eğer acilisyonu "sol" EY "Bu kapı sola açılır"
	 * */
	public int kapiEn=90;
	public int kapiBoy=190;
	public String rengi="beyaz";
	public String acilisyonu="sağ";
	public Kapi(int kapiEn, int kapiBoy, String rengi, String acilisyonu) {
		
		this.kapiEn = kapiEn;
		this.kapiBoy = kapiBoy;
		this.rengi = rengi;
		this.acilisyonu = acilisyonu;
	}
	public Kapi() {
		
	}
	public void hangiYoneAcilir() {
		if(acilisyonu.equals("sağ")) {
			System.out.println("Bu kapı sağa açılır");
		}else {
			System.out.println("Bu kapı sola açılır");
		}
	}
	
	

}
