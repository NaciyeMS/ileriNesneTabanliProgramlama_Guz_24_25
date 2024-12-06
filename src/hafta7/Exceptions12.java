package hafta7;

public class Exceptions12 {
	public static void main(String[] args) {
		 int a=12,b=4;
	        int[]c={3,5,7,9};
	}
	
	    public static void bring(int[]c, int a,int b){
	        try {
	            int idx=a/b;
	            int element=c[idx];
	            System.out.println(element);
	        }  finally { //final her halukarda çalışır
	            System.out.println("database il ebağlanıtyı kesiniz");
	        }
	        System.out.println("finaly sonrası app çalışıyor");
	        // Coklu finally block kullanilamaz
	//java da try + bir catch, try + birden fazla catch, try + catch + finally,
	// try + finally kullanilabilir.
	    }
}
