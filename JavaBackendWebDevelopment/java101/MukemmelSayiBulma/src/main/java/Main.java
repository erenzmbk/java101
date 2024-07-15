import java.util.Scanner;

public class Main{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int toplam =0;
        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        
        
        for(int i =1; i< sayi;i++)
        {
            if (sayi % i == 0)
            {
                toplam +=i;
            }
        }
        
        if (toplam == sayi) 
        {
            System.out.println(sayi + " Sayisi mukemmel sayidir");
        }
        else
        {
            System.out.println(sayi + " Sayisi Mukemmel sayi degildir");
        }
        
        
        
    }
}
