
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sayi;
        int sayac = 0;
        System.out.print("Lutfen sayiyi giriniz = ");
        sayi = input.nextInt();
        int toplam = 0;
        
       for(int i = 0 ; i <= sayi;i++) {
           if((i % 3 == 0) && (i % 4 == 0)){
               sayac++;
               toplam +=i;
           }
       }
        
       
        int ortalama =  toplam / sayac;
        
        System.out.print("sayilarin ortalamasi" + ortalama );
        
    }
}
