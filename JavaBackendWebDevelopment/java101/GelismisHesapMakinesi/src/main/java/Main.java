import java.util.Scanner;
public class Main {
    
    //Gelişmiş Hesap Makinesi
    
    
    static void plus()
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i=1;
        while(true)
        {
            System.out.print(i++ + ". sayi");
            number = scan.nextInt();    
            if(number == 0)
            {
                break;
            }
            result += number;
        }
        System.out.println("sonuc : " + result);
    }
    
    static void minus()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) 
        {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) 
            {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    
    static void times() 
    {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) 
        {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) 
            {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
        
    static void divided() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) 
        {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) 
            {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    
    static void power() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) 
        {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    
     static void factorial() 
     {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) 
        {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    
     
     static void mod() 
     {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının modunu almak istiyorsunuz?: ");
        int num = input.nextInt();
        System.out.print("Hangi sayıya göre mod almak istiyorsunuz?: ");
        int modNum = input.nextInt();
        if (num == 0 && modNum == 0) 
        {
            System.out.println("Lütfen geçerli değerler giriniz: ");
        } 
        else 
        {
            result = num % modNum;
            System.out.println("Sonuç: " + result);
        }
    }
     
     static void rectangle() 
     {
        int uzunKenar, kısaKenar, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        uzunKenar = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        kısaKenar = input.nextInt();

        cevre = (uzunKenar * 2) + (kısaKenar * 2);
        alan = uzunKenar * kısaKenar;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("-------------------------");
        String menu = "1-Toplama Islemi\n" +
                "2-Cikkarma Islemi\n" +
                "3-Carpma Islemi\n" +
                "4-Bolme Islemi\n" +
                "5-Uslu Sayi Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdortgen Alan ve Cevre Hesabi\n" +
                "0- Cikis Yap\n";
     
        
        do 
        {
            System.out.println("--------------------------");
            System.out.print(menu);
            System.out.println("--------------------------");
            System.out.println("----- HESAP MAKINESI -----");
            System.out.println("--------------------------");
            System.out.print("Yapmak istediginiz islemi seciniz: ");
            choice = input.nextInt();

            switch (choice) 
            {
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!");
            }
              } while (choice != 0);
    }
}
