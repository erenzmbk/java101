import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int sayi1 = 0 , sayi2 = 1;
        int toplam = sayi1 + sayi2;
        
        System.out.println("Sayi adeti giriniz : ");
        int adet = input.nextInt();
        
        System.out.print(sayi1 + " "+ sayi2 + " ");
        
        while(adet > 0)
        {
            System.out.print(toplam + " ");
            adet--;
            sayi1= sayi2; 
            sayi2=toplam; 
            toplam=sayi1+sayi2;
        }
        
    }
}
