package hafta7;

public class Exceptions6 {
	public static void main(String[] args) {	
	    // Geçerli bir öğrenci adı
	    String studentName1 = "Ali Veli";
	    convertToUpperCase(studentName1);	
	    // Boş bir metin
	    String studentName2 = "";
	    convertToUpperCase(studentName2);	
	    // null değerli bir öğrenci adı
	    String studentName3 = null;
	    convertToUpperCase(studentName3);
	}
	 public static void convertToUpperCase(String studentName) {
		 try {
	            // Öğrenci adını büyük harfe çevir
	            String upperCaseName = studentName.toUpperCase();
	            System.out.println("Büyük harfli adı: " + upperCaseName);
	        } catch (NullPointerException e) {
	            // null değeri kontrol et ve kullanıcıya bilgi ver
	            System.err.println("null bir öğrenci adı ile işlem yapılamaz."
	            		+ " Lütfen geçerli bir ad giriniz.");
	        }
    }
}
