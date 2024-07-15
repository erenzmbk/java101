
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       // Kenar uzunluklarını kullanıcıdan alma
        System.out.print("a kenar uzunluğunu giriniz: ");
        double a = scanner.nextDouble();
        System.out.print("b kenar uzunluğunu giriniz: ");
        double b = scanner.nextDouble();
        System.out.print("c kenar uzunluğunu giriniz: ");
        double c = scanner.nextDouble();

        // Yarı çevreyi hesaplama
        double u = (a + b + c) / 2;

        // Alanı hesaplama
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Sonucu yazdırma
        System.out.println("Üçgenin alanı: " + alan);
    }
}
