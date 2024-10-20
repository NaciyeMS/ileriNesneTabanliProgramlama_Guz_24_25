package hafta1_methods_overloadings_varargs;

public class Overloading_Metod_Ornek {
	  public static void main(String[] args) {
	      dortgen(3,2,5,6);      
	    }
	    public static void dortgen (int x){
	        System.out.println("Karenin Çevresi:"+(4*x));
	    }
	     public static void dortgen (int x, int y){
	        System.out.println("Dikdörtgen Çevresi:"+(x+y)*2);
	    }
	       public static void dortgen (int x, int y,int z, int m){
	        System.out.println("Dörtgen Çevresi:"+(x+y+z+m));
	    }
}
