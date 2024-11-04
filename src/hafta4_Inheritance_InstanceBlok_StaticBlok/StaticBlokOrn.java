package hafta4_Inheritance_InstanceBlok_StaticBlok;
import java.time.LocalDate;
public class StaticBlokOrn {
	static int price;
    static{
        System.out.println("static blok örnek");
        LocalDate currentDate=LocalDate.now();
        if(currentDate.getMonthValue()==2)
        {
            price=1000;
        }
        else{
            price=2000;
        }
    }
    public static void main(String[] args) {
    	System.out.println(price);
    }
}
