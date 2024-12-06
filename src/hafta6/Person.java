package hafta6;
public class Person {
	private String name;  	// Private değişken
    private int age;  
    public String getName() {
        return name;      	// Getter metodu
    }   
    public void setName(String name) {
        this.name = name;   // Setter metodu
    }
    public int getAge() {
        return age;			// Getter metodu
    }
    public void setAge(int age) { // Setter metodu (doğrulama ekledik)
        if (age > 0) {           
        	// Yaşın pozitif olması gerektiğini kontrol ediyoruz
            this.age = age;
        } else {
            System.out.println("Yaş negatif olamaz!");
        }
    }
}
