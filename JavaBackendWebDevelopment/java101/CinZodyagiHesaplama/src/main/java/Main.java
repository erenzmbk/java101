/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int date;
        String burc = "";
        
        System.out.print("Lutfen dogum tarihinizi giriniz : ");
        date = input.nextInt();
        
        
        if(date % 12 == 0) {
            burc = "Maymun";
        }
        if(date % 12 == 1) {
            burc ="Horoz";
        }
        if(date % 12 == 2) {
            burc ="Kopek";
        }
        if(date % 12 == 3) {
            burc ="Domuz";
        }
        if(date % 12 == 4 ) {
            burc = "Fare";
        }      
        if(date % 12 == 5) {
            burc = "Okuz";
        }  
        if(date % 12 == 6 ) {
            burc = "Kaplan";
        }  
        if(date % 12 == 7) {
            burc = "Tavsan";
        }  
        if(date % 12 == 8) {
            burc = "Ejderha";
        }  
        if(date % 12 == 9) {
            burc = "Yılan";
        }
        if(date % 12 == 10) {
            burc = "At";
        }  
        if(date % 12 == 11 ) {
            burc = "Koyun";
        }  
        
        System.out.print("Cin zodyagi burcunuz : " + burc);
        
        
    }
}
