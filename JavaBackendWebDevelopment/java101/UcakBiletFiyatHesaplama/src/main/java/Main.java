
/**
 *
 * @author Eren Zambak 
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        double mesafe = input.nextDouble();
        
        System.out.print("Yasinizi giriniz : ");
        int yas = input.nextInt();
        
        System.out.print("Yolculuk tipini giriniz (1 => Tek yon 2=> Gidis - donus) : ");
        int yolculukTipi = input.nextInt();
        
        if(mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.print("Hatali veri girdiniz.");
            return;
        }
        
        
        double toplamUcret = mesafe * 0.10;
        
        
        double yasIndirimi = 0;
        if(yas < 12)
        {
            yasIndirimi = toplamUcret * 0.50;
        }
        else if (yas <= 24)
        {
            yasIndirimi = toplamUcret * 0.10;
        }
        else if(yas >=65)
        {
            yasIndirimi = toplamUcret * 0.30;
        }    
        
        
        double gidisDonusIndirimi = 0;
        if(yolculukTipi == 2) {
            gidisDonusIndirimi = toplamUcret * 0.20;
        }
        
        
        double indirimliUcret = toplamUcret - yasIndirimi - gidisDonusIndirimi;
        
        System.out.println("Ucak Bileti Fiyati Hesaplama Sonuclari");
        
        System.out.println("Mesafe: " + mesafe + " km");
        System.out.println("Yas: " + yas);
        System.out.println("Yolculuk Tipi: " + (yolculukTipi == 1 ? "Tek Yon" : "Gidis Donus"));
        System.out.println("Normal Ucret: " + String.format("%.2f", toplamUcret) + " TL");
        System.out.println("Yas Indirimi: " + String.format("%.2f", yasIndirimi) + " TL");
        System.out.println("Gidis Donus Indirimi: " + String.format("%.2f", gidisDonusIndirimi) + " TL");
        System.out.println("Indirimli Ucret: " + String.format("%.2f", indirimliUcret) + " TL");
        
        
        
    }
}
