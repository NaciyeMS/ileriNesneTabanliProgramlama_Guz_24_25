package hafta5_3super_this_metodCagrisi;
public class Baba extends Dede{
	int babaCuzdan=2000;
	public Baba() {
		super();
		System.out.println("Sakin çocuk bizimki,"
				+ " demek ki zamanı var.");
	}
	public Baba(String fikirIstek) {
		super("Dedesi sen ne dersin");
		System.out.println("Daha erken!"
				+ " Önce para biriktir");
	}
}
