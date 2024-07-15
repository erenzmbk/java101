
/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
	
    public class Main {
        public static void main(String[] args) {
	        double tutar, kdvOran = 0.18;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Ucret tutarini giriniz : ");
	        tutar = input.nextDouble();
	        double kdvTutar = tutar * kdvOran;
	        double kdvliTutar = tutar + kdvTutar;
	        System.out.println("KDV'siz tutar : " + tutar);
	        System.out.println("KDV Orani : " + kdvOran);
	        System.out.println("KDV tutari : " + kdvTutar);
	        System.out.println("KDV'li tutar : " + kdvliTutar);    
         }
}

