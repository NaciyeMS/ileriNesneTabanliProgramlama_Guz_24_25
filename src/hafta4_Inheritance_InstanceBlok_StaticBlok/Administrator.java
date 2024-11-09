package hafta4_Inheritance_InstanceBlok_StaticBlok;

public class Administrator {
	    private String name;
	    private int age;
	    private String department;

	    public Administrator(String name, int age, String department) {
	        this.name = name;
	        this.age = age;
	        this.department = department;
	    }

	    public void introduce() {
	        System.out.println("Merhaba, ben " + name + " ve yaşım " + age);
	    }

	    public void manage() {
	        System.out.println(name + " adlı yönetici " + department + " bölümünü yönetiyor.");
	    }
}
