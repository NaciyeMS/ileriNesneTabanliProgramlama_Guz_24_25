package hafta6;

public class PersonRunner {
	 public static void main(String[] args) {
		 Person person = new Person();     
	     // Setter metoduyla veri atama
		
	     person.setName("Naciye");
	     person.setAge(25);

	     // Getter metoduyla verileri alma
	     System.out.println("Ad: " + person.getName());
	     System.out.println("Yaş: " + person.getAge());

	     // Hatalı veri atama
	     person.setAge(-5); 
	     // "Yaş negatif olamaz!" yazdırır.
	}
}
