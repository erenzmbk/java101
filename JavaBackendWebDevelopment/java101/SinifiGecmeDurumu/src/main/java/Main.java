
/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matematik, fizik, turkce, kimya, muzik;
        int gecerliNotSayisi =0;
        double toplamNot = 0;
        double ortalama;
        
        System.out.print("Matematik notunu giriniz : ");
        matematik = input.nextInt();
        if(matematik >=0 && matematik <= 100) {
            gecerliNotSayisi++;
            toplamNot += matematik;
        }
        
        
        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        if(fizik >=0 && fizik <= 100) {
            gecerliNotSayisi++;
            toplamNot += fizik;
        }
        
        
        System.out.print("Turkce notunu giriniz : ");
        turkce = input.nextInt();
        if(turkce >=0 && turkce <= 100) {
            gecerliNotSayisi++;
            toplamNot += turkce;
        }
      
        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        if(kimya >=0 && kimya <= 100) {
            gecerliNotSayisi++;
            toplamNot += kimya;
        }
        

        System.out.print("Muzik notunu giriniz : ");
        muzik = input.nextInt();
        if(muzik >=0 && muzik <= 100) {
            gecerliNotSayisi++;
            toplamNot += muzik;
        }
       
        
        if(gecerliNotSayisi > 0) {
            ortalama = toplamNot / gecerliNotSayisi;
            if(ortalama <= 55) {
            System.out.print("Sinifta kaldiniz :(");
            }
            else {
            System.out.println("Tebrikler sifinifi gectiniz :)");
            }
            System.out.print("Ortalamaniz = " + ortalama);
            }
        else {
            System.out.print("Gecerli not girilmedi lutfen tekrar deneyiniz.");
        }          
    }
}
