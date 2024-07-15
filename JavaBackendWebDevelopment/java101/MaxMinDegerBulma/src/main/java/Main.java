/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
    
        Scanner input = new Scanner(System.in);
        int max =0 , min=0, sayi, num;
        
        System.out.print("Kac Sayi Gireceksiniz : ");
        num = input.nextInt();
        
        for(int i=1; i<=num;i++)
        {
            if(num < 1)
            {
                System.out.println("Lutfen pozitif bir sayi giriniz !");
            }
            
            System.out.print(i + ". sayiyi giriniz : ");
            sayi = input.nextInt();
            
            if (i == 1) 
            {
                max = sayi;
                min = sayi;
            }
            if (sayi > max) 
            {
                max= sayi;
            }
            if (sayi < min) 
            {
                min = sayi;
            }
        }
            System.out.println("-----------");
            System.out.println("En buyuk sayi : " + max);
            System.out.println("En kucuk sayi : " + min);
        
    }
}

