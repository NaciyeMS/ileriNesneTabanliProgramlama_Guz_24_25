package hafta3_AccesModifier_PassByValue_Static_ToString;

public class StaticClassRunner {
	public static void main(String[] args) {
		//static veriler için 
		StaticClass s1=new StaticClass();
		s1.dolap=12;
		
		StaticClass s2=new StaticClass();
		s2.dolap=7;
		
		System.out.println(s1.dolap);
		System.out.println(s2.dolap);
		
	}
}
