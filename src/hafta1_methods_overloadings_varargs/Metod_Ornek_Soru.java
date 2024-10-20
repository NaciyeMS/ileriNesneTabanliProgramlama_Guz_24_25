package hafta1_methods_overloadings_varargs;

public class Metod_Ornek_Soru {
	   public static void main(String[] args) {
		    int vize=90, finaln=80,proje=100;    
		        System.out.println(ortalama(vize,finaln,proje));
		    }

		    private static int ortalama(int vize, int finaln, int proje) {
		    int ort=vize*50/100+finaln*30/100+proje*20/100;   
		    return ort;
		    }
}
