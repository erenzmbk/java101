// yaricapi r, merkez acisinin ölcüsü a olan daire diliminin alanını bulan program



import java.util.Scanner;


public class Main{
        public static void main(String[] args) {
    
        double pi = 3.14;
        int r , merkezAci;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yaricapi giriniz : ");
        r = input.nextInt();
        
        System.out.print("Merkez acisini giriniz : ");
        merkezAci = input.nextInt();
        
        double alan = (pi * (r*r) * merkezAci ) / 360 ;
        
        System.out.print("Dairenizin alani : " + alan);
        }
}
