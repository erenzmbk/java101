import java.util.Scanner;
/**
 *
 * @author Eren Zambak
 */
public class Main {
    public static void main(String[] args) {
        int n1 , n2 , select;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Birinci Sayiyi giriniz : ");
        n1 = input.nextInt();
        
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = input.nextInt();
        
        System.out.print("Yapmak istediginiz islem(1:+ 2:- 3:X 4:/)");
        select = input.nextInt();
        
        switch(select) {
            case 1:
                System.out.print("Toplam : " +(n1+n2) );
                break;
            case 2:
                System.out.print("Fark : " +(n1-n2));
                break;
            case 3: 
                System.out.print("Carpim : " + (n1*n2));
                break;
            case 4:
                System.out.print("Bolum : " + (n1/n2));
                break;
            default:
                System.out.print("Gecersiz sayi girdiniz !");
                break;       
        }
        
     
    }
}
