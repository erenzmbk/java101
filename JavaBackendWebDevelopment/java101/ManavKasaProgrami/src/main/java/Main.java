/**
 *
 * @author Eren Zambak 2024
 */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.0;
        
        System.out.print("Elma kac kilo ? : ");
        double ElmaKg = input.nextDouble();
        
        System.out.print("Armut kac kilo ? : ");
        double ArmutKg = input.nextDouble();
        
        System.out.print("Domates kac kilo ? : ");
        double DomatesKg = input.nextDouble();
        
        System.out.print("Muz kac kilo ? : ");
        double MuzKg = input.nextDouble();
        
        System.out.print("Patlican kac kilo ? : ");
        double PatlicanKg = input.nextDouble();
        
        double toplamFiyat =((Armut * ArmutKg) + (Elma * ElmaKg) + (Domates * DomatesKg)
                + (Muz * MuzKg) + (Patlican * PatlicanKg));
        
        
        System.out.print("Toplam Tutar = " + toplamFiyat);
    }
    
}
