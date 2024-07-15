
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.


import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int n,k;
        
        System.out.print("Ussu alinacak sayi : ");
        n = input.nextInt();
        
        System.out.print("Us olacak sayi : ");
        k = input.nextInt();
        
        int total =1;
        
        
        for(int i = 1 ; i <=k; i++) {
            total *= n;
            
        }
        
        System.out.print("Cevap = " + total);
        
    }
    
    
}
