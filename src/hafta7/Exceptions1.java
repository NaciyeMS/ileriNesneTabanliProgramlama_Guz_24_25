package hafta7;
public class Exceptions1 {
	 public static void main(String[] args) {
	        calculateModulus(10, 0);
	    }
	 public static void calculateModulus(int x, int y) {
			try {
				 if(y==0) {
					 throw new ArithmeticException();
					 //bazen biz custom işlerimizde throw fırlatırız. 
				 }
				 System.out.println(x%y);
			} catch (ArithmeticException e) {
				System.out.println("catch bölümü çalıştı");
			}	
	    }
}
