package hafta7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions10 {
	public static void main(String[] args) {
		 
		try {
			 FileInputStream fis = new FileInputStream("src\\hafta7\\file.txt");
			int k=0;//okunan değerleri bunun içinde saklayacağız
		      while((k=fis.read())!=-1){//compile time hatası read önce hata verdi
		          System.out.print((char)k);
		      }
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	      
	}
}

