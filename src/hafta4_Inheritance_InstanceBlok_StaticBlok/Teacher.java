package hafta4_Inheritance_InstanceBlok_StaticBlok;

public class Teacher {
	private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("Merhaba, ben " + name + " ve yaşım " + age);
    }

    public void teach() {
        System.out.println(name + " adlı öğretmen " + subject + " dersini veriyor.");
    }
}
