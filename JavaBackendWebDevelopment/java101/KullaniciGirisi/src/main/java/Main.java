/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String userName, password, createUserName, createPassword, newPassword;
        
        
        System.out.println("Hosgeldiniz, Lutfen hesap olusturun");
        System.out.print("Kullanici Adi : ");
        createUserName = input.nextLine();
        
        System.out.print("Sifre : ");
        createPassword = input.nextLine();
        
        System.out.println("Hesap basarili bir sekilde olusturuldu. Lutfen giris yapiniz :) ");
        
        System.out.print("Lufen Kullanici adinizi giriniz : ");
        userName = input.nextLine();
        
        System.out.print("Lutfen sifrenizi giriniz ");
        password = input.nextLine();
        
        if((userName.equals(createUserName)) && (password.equals(createPassword))) 
        {
            System.out.print("Basarili bir sekilde giris yaptiniz :)");
        }
         else 
        {
            System.out.print("Bilgileriniz yanlis. Sifrenizi sifirlamak ister misiniz (E/H)");    
        }  
        
       
        String answer = input.nextLine();
        
        if(answer.equalsIgnoreCase("E")) 
        {
            System.out.println("Yeni sifreniz olusturdugunuz ve girdiginiz sifre ile ayni olmamalidir");
            System.out.print("Yeni sifrenizi giriniz : ");
            newPassword = input.nextLine();
                if(newPassword.equals(createPassword) && (newPassword.equals(password)))
                {
                    System.out.print("Sifre basarili bir sekilde olusturuldu :) ");
                }
                else
                {
                    System.out.print("Sifre olusturalamadi, lutfen baska sifre deneyiniz !!");
                }
                    
       }
                else
                {
                    System.out.print("Peki,iyi günler dileriz");
                }
        
    }
}
   
                        
                        
        

