/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
public class vucut_kitle_endeksi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double kilo, boy, indeks;
        
        System.out.print("Lutfen kilonuzu giriniz :");
        kilo = input.nextDouble();
        
        System.out.print("Lutfen boyunuzu(metre cinsinden) giriniz :");
        boy = input.nextDouble();
        
        indeks = kilo / (boy * boy);
        
        System.out.print("Vucut kitle indeksiniz : " + indeks);
        
        
        
        
    }
}
