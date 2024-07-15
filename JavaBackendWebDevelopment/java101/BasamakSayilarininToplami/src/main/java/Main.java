/**
 *
 * @author Eren Zambak
 */

//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sayi;
        int adet = 0 , toplam =0;
        
        System.out.println("Basamak Sayilarinin Toplamini Hesaplama ");
        System.out.print("Bir sayi giriniz = ");
        sayi = input.nextInt();
        
        
        while(sayi !=0) {
            toplam = (sayi%10) + toplam;
            sayi /= 10;
            ++adet;
        }
        System.out.print("Basamaklarin toplami = " + toplam);       
    }   
}
