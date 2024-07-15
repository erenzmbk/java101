
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int basamak_sayisi;
        
        
        
        
        System.out.println("Basamak Sayisini giriniz : ");
        basamak_sayisi = input.nextInt();
        
        for(int i=0; i < basamak_sayisi ; basamak_sayisi--)
        {
            for (int k=0; k < basamak_sayisi + (basamak_sayisi - 1)  ; k++)
            {
                System.out.print("*");
                
            }
            
            
            System.out.println(" ");
             
        }
        
        
        
        
    }
}
