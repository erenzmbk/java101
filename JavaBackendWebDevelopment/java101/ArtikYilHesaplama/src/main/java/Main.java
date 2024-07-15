/**
 *
 * @author Eren Zambak
 */

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int year;
      
      System.out.print("Yil giriniz : ");
      year = input.nextInt();
      
      
      if(year % 100 == 0 )
      {
          if(year % 400 == 0 )
          {
              System.out.print(year + " Artik yildir");
          }
          else
          {
              System.out.print(year + " Artik yil degildir");
          }
      }
      else if(year % 4 == 0)
      {
          System.out.print(year + " Artik yildir");
      }
      else {
          System.out.print(year + " Artik yil degildir");
      }
      
      
  }
          
}
