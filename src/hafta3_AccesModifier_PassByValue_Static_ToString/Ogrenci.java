package hafta3_;

public class Ogrenci {
	String adSoyad;
	int sinif;
	String tcNo;
	String ders;
	double dersNotu;
	public Ogrenci(String adSoyad, int sinif, String tcNo, String ders, double dersNotu) {
		this.adSoyad = adSoyad;
		this.sinif = sinif;
		this.tcNo = tcNo;
		this.ders = ders;
		this.dersNotu = dersNotu;
	}
	public Ogrenci(String adSoyad, int sinif, String tcNo) {
		this.adSoyad = adSoyad;
		this.sinif = sinif;
		this.tcNo = tcNo;
		this.ders="henüz atanmadı";
		this.dersNotu=0;
	}
	public void dersDurumu(double dersNotu) {
		if(dersNotu>=50) System.out.println("Geçti");
		else System.out.println("Kaldı");
	}
	public void harfNotu(double dersNotu) {
		if(dersNotu<50)System.out.println("FF");
		else if(dersNotu<60)System.out.println("CC");
		else if(dersNotu<70)System.out.println("CB");
		else if(dersNotu<80)System.out.println("BB");
		else if(dersNotu<90)System.out.println("BA");
		else System.out.println("AA");
	}
	@Override
	public String toString() {
		return "Ogrenci [adSoyad=" + adSoyad +
				", sinif=" + sinif + 
				", tcNo=" + tcNo +
				", ders=" + ders +
				", dersNotu="+ dersNotu + "]";
	}
	
	

}
