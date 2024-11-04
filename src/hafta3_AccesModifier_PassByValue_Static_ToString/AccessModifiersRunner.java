package hafta3_;

public class AccessModifiersRunner {
	public static void main(String[] args) {
		AccessModifiers1 a1=new AccessModifiers1();
		System.out.println(a1.publicDegisken); 	 	
		//System.out.println(a1.privateDegisken);	
		System.out.println(a1.protectedDegisken);
		System.out.println(a1.defaultDegisken);
	}
}
