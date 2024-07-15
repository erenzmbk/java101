import java.util.Scanner;

//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        
        
        System.out.print("Girilen Sayi : ");
        int girilenSayi = input.nextInt();
        
        int minClosest = Integer.MIN_VALUE;
        int maxClosest = Integer.MAX_VALUE;
        
        for(int i: dizi)
        {
            if(i<girilenSayi && i>minClosest)
            {
                minClosest = i;
            }
            
            if(i>girilenSayi && i<maxClosest)
            {
                maxClosest = i;
            }
        }
        
        
        if(minClosest == Integer.MAX_VALUE){
            System.out.println("Girilen sayidan kucuk en yakin sayi yok");
        }
        else{
            System.out.println("Girilen sayidan en kucuk sayi : " + minClosest);
        }
            
        if(maxClosest == Integer.MIN_VALUE)
        {
            System.out.println("Girilen sayidan büyük en yakin sayi yok ");
        }
        else
        {
            System.out.println("Girilen sayidan en buyuk sayi : " + maxClosest );
        }
        
    }
}
