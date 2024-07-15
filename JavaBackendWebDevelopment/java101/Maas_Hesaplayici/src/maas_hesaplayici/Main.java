
package maas_hesaplayici;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Employee calisan1 = new Employee("Eren",10000,45,2010);
        
        calisan1.tax();
        calisan1.bonus();
        calisan1.raiseSalary();
        calisan1.string();
        
        
        
    }
}
