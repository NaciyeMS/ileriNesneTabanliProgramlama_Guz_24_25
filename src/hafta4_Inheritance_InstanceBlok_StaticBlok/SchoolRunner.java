package hafta4_Inheritance_InstanceBlok_StaticBlok;

public class SchoolRunner {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Ahmet", 40, "Matematik");
        teacher.introduce();
        teacher.teach();

        Student student = new Student("Ayşe", 16, 10);
        student.introduce();
        student.study();

        Administrator admin = new Administrator("Mehmet", 50, "İdari İşler");
        admin.introduce();
        admin.manage();
	}
}
