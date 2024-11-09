package hafta5_1superCallsOrnek1;
public class Baba extends Dede{
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
