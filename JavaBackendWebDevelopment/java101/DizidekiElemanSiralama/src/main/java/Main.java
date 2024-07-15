import java.util.Scanner;
import java.util.Arrays;

// Dizideki Elemanları Sıralama
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dizinin boyutunu giriniz : ");
        int num = input.nextInt();
        int[] array = new int[num];
        int value;
        
        
        System.out.println("Dizinin elemanlarini giriniz : ");
        
        for(int i = 0; i < array.length ; i++)
        {
            System.out.println((i + 1) + ". elemani giriniz : ");
            value = input.nextInt();
            array[i] = value;
        }
        
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------");
        System.out.println("Siralama : ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
