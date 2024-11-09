package hafta4_Inheritance_InstanceBlok_StaticBlok;

public class Student {
	private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("Merhaba, ben " + name + " ve yaşım " + age);
    }

    public void study() {
        System.out.println(name + " adlı öğrenci " + grade + ". sınıfta ders çalışıyor.");
    }
}
