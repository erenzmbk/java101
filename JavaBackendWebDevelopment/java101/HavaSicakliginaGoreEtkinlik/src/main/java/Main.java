/**
 *
 * @author Eren Zambak
 */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        
        System.out.print("Lutfen sicakligi giriniz = ");
        heat = input.nextInt();
        
        if(heat < 5) 
        {
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(heat >= 5 && heat <= 25) 
        {
           if(heat <=15)
           {
               System.out.println("Sinemaya gidebilirsiniz");
           }
           if(heat >= 10 )
           {
               System.out.print("Piknige gidebilirsiniz.");
           }
        }
        else
        {
            System.out.print("Yuzmeye gidebilirsiniz");
        }
        
    }
}
