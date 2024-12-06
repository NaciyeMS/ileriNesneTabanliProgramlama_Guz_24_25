package hafta7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions11 {
public static void main(String[] args) {
    try {
        System.out.println(10 / 0); // ArithmeticException oluşacak
    } catch (ArithmeticException e) {
        System.out.println("Hata: " + e.getMessage());
    } finally {
        System.out.println("finally bloğu her durumda çalışır");
    }
}
}
