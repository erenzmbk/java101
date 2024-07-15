
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Birinci Sayiyi giriniz : ");
        int number1 = input.nextInt();
        
        System.out.println("İkinci Sayiyi giriniz");
        int number2 = input.nextInt();
        
        int ebob = 1 , ekok = 1;
        int x=1, z=1;
        
        if(number2 > number1) 
        {
            while (x <= number1)
            {
                if(number1 % x == 0 && number2 % x== 0)
                {
                    ebob = x;
                }
                x++;
            }
            System.out.println("EBOB:" + ebob);
        }
        else
        {
            while (z <= number2)
            {
                if(number1 % z == 0 && number2 % z == 0)
                {
                    ebob = z;
                }
                z++;
            }
            System.out.println("EBOB : " + ebob);
        }
        
        ekok = (number1 * number2) / ebob;
        System.out.println("EKOK: " + ekok);
        
        
    }
}
