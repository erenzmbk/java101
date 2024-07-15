/**
 *
 * @author Eren Zambak
*/

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Lutfen bir sayi giriniz : ");
        number = input.nextInt();
        
        for(int i = 0; Math.pow(4,i) <= number; i++) {
            
            if(i==0) {
                System.out.print(1 + ", ");
                continue;
            }
            
            System.out.print((int) Math.pow(4,i)+ ", ");
            
            if (Math.pow(5,i) <= number) {
                System.out.print((int) Math.pow(5,i) +", ");
            }
            
            
        }
        
        input.close();
        
        
        
    }
}
