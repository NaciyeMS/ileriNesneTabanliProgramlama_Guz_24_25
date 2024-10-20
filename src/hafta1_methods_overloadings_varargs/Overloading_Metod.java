package hafta1_methods_overloadings_varargs;

public class Overloading_Metod {
	  public static void main(String[] args) {
	    //metod overloading 
	            add(3,5);
	            add(8,9,7);
	            add(4, 5.7);
	            add(3.2, 6.5);
	            add(5.9 ,3);
	    }
	    public static void add(double x, double y){ //D
	        System.out.println(x+y);
	    }
	    public static void add(int x, double y){ //C
	        System.out.println(x+y);
	    }
	    public static void add(int x, int y){//A
	        System.out.println(x+y);
	    }
	    public static void add(int x, int y,int z){ //B
	        System.out.println(x+y+z);
	    }
	    
}
