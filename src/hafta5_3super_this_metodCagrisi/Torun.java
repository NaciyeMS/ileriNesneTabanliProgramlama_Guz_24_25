package hafta5_3super_this_metodCagrisi;
public class Torun extends Baba {
	int torunCuzdan=100;
	public Torun() {	
		super();		
		System.out.println("Kendi cüzdanıma bakayım"
				+this.torunCuzdan);
		System.out.println("Dedemin cüzdanına bakayım"
		+super.dedeCuzdan);
		System.out.println("Babamın cüzdanına bakayım"
		+super.babaCuzdan);
	}
	public Torun(String torunIstek) {
		super("Baba sen ne dersin");
		System.out.println("Ben biraz biriktireyim "
				+ "dedem devamını tamamlar");	}

}
