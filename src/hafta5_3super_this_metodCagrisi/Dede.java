package hafta5_3super_this_metodCagrisi;
public class Dede {
	int dedeCuzdan=1200;
	public Dede() {
		this("Ben gençliğimde napmıştım");
		System.out.println("torun büyüdü ama"
				+ " araba falan istemiyor, ilginç!");}
	public Dede(String soruIstek) {
		super();
		System.out.println("Yakışır torunuma!"
				+ "Ben destek olurum");}
}
