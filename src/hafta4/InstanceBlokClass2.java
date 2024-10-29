package hafta4;

public class InstanceBlokClass2 {
	public String colorCar;
    public String fuelType;
    {
        colorCar="black";
        fuelType="benzin";
    }
    public InstanceBlokClass2() {
        System.out.println("Araban Rengi"+colorCar);
        System.out.println("Araban benzin tipi"+fuelType);
    }

    public InstanceBlokClass2(String fuelType, String colorCar) {
        this.fuelType = fuelType;
        this.colorCar = colorCar;
        System.out.println("Araban Rengi"+this.colorCar);
        System.out.println("Araban benzin tipi"+this.fuelType);
    }
}
