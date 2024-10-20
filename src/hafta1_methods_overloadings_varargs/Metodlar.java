package hafta1_methods_overloadings_varargs;

public class Metodlar {
    public static void main(String[] args) {
        // TODO code application logic here
       topla(8,6);
       topla(96,5);
        System.out.println("kodlar buradan devam ediyor");
        System.out.println(topla3());
        topla4();
     
    }
    public static void topla4(){// parametre almayan //geriye değer döndürmeyen fonksiyon
    int x=5,y=7;
    int sonuc=x+y;
    System.out.println(sonuc);
    }
    public static int topla3(){ //parametre almayan //geriye değer döndüren
    int x=5,y=7;
    int sonuc=x+y;
    return sonuc;
    }    
    public static void topla(int x,int y){ //parametre alan // geriye değer döndürmeyen
    int sonuc=x+y;
    System.out.println(sonuc);
    }
     public static int topla2(int x,int y, int z){ //parametre alan //geriye değer döndüren
    int sonuc=x+y+z;
    return sonuc;
    }
}
