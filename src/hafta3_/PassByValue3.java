package hafta3_;

public class PassByValue3 {

	public static void main(String[] args) {
		NewClass obj=new NewClass();
		obj.value=20;
		degistirNesne(obj);
		System.out.println(obj.value);
		degistirReferans(obj);
		System.out.println(obj.value);

	}
	private static void degistirNesne(NewClass obj) {
		obj.value=30;		
	}
	private static void degistirReferans(NewClass obj) {
		obj=new NewClass();
		obj.value=50;
	}

}
