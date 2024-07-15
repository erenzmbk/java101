
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        int total=0;
        
        do{
            System.out.print("Sayi giriniz : ");
            n = input.nextInt();
            if(n % 2 ==0) {
                total += n;
            }
                
            
        } while(n % 2 == 0);
        
        System.out.println("Toplam" + total);
        
        
    }
}
