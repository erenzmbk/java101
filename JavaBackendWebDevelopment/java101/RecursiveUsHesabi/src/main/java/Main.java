import java.util.Scanner;
public class Main {
    
    static int power(int base, int power)
    {
        if(power !=0)
        {
            return base * power(base, power -1);
        }
        else
        {
            return 1;
        }
    }
    
    public static void main(String[] args)
    {
        int base, power;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayisi");
        base = input.nextInt();
        
        System.out.print("Us sayisini giriniz : ");
        power = input.nextInt();
        
        System.out.print("Sonuc: "  + power(base,power));   
    }
}