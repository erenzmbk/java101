
/**
 *
 * @author Eren Zambak
 */
	import java.util.Scanner;
	
	public class Main {
	    public static void main(String[]args) {
	        //degiskenleri belirle
	        int mat,fizik,kimya,turkce,tarih,muzik;
	        int ortalama;
	        
	        //Scanner sınıfını tanımla
	        Scanner input = new Scanner(System.in);
	        
	        //Kullanıcıdan degerleri al
	        System.out.print("Matematik notunuzu giriniz : ");
	        mat = input.nextInt();
	        
	        System.out.print("Fizik notunuzu giriniz : ");
	        fizik = input.nextInt();
	        
	        System.out.print("Kimya notunuzu giriniz : ");
	        kimya = input.nextInt();
	        
	        System.out.print("Turkce notunuzu giriniz : ");
	        turkce = input.nextInt();
	        
	        System.out.print("Tarih notunuzu giriniz : ");
	        tarih = input.nextInt();
	        
	        System.out.print("Muzik notunuzu giriniz : ");
	        muzik = input.nextInt();
	            
	        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6 ;
	        
	        System.out.println("ortalamaniz : " + ortalama);
	        
	        if(ortalama >= 60) {
	            System.out.print("Sinifi gecti");
	        }
	        else
	            System.out.print("Sinifta Kaldi");
	    }
	}
