import java.util.Scanner;
public class Main {
    
    static int asal(int num, int i)
    {
        if(num==1)
        {
            return 1;
        }
        else
        {
            if(num % i == 0)
            {
                return 0;
            }
            else
            {
                return asal(num, i+1);
            }
        }
    }
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        int num = input.nextInt();
        int i = 2;
        
        if(asal(num,i) == 1)
        {
            System.out.print(num + " Sayisi asaldir");
        }
        else
        {
            System.out.print(num + " Sayisi asal degildir");
        }
        
    }
    
}
