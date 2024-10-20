package hafta2_PassByValue_Classes_Constructors;

public class Tugla {	
	
	public Tugla() {
	}
	public Tugla(int tuglaEn, int tuglaBoy, int tuglaYukseklik) {
		this.tuglaEn = tuglaEn;
		this.tuglaBoy = tuglaBoy;
		this.tuglaYukseklik = tuglaYukseklik;
	}
	public Tugla(int tuglaEn, int tuglaBoy) {
		this.tuglaEn = tuglaEn;
		this.tuglaBoy = tuglaBoy;
	}
	public int tuglaEn=10;
	public int tuglaBoy=7;
	public int tuglaYukseklik=5;
	//işlevler eylemler action 
	public void hacimHesapla() {
		int hacim=tuglaEn*tuglaBoy*tuglaYukseklik;
		System.out.println(hacim);
	}

}
