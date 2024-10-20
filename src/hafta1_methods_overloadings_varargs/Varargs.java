package hafta1_methods_overloadings_varargs;

public class Varargs {
	public static void main(String[] args) {
        //VARARGS 
     
        add(7,4,4);
    }
    public static void add(int... ncy){
    int sum=0;
     for(int w :ncy   ){
     sum=sum+w;
     }
     
        System.out.println(sum );
    }
}
