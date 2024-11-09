package hafta5_1superCallsOrnek1;
public class Torun extends Baba {
	public Torun() {
		super();
		System.out.println("Ne arabası ya,"
				+ " daha düşünmedim bile!");
	}
	public Torun(String torunIstek) {
		super("Baba sen ne dersin");
		System.out.println("Ben biraz biriktireyim "
				+ "dedem devamını tamamlar");
	}

}
