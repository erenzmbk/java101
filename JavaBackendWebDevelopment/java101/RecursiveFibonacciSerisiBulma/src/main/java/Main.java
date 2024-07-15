
//Recursive ile Fibonacci Serisi Bulan Program

import java.util.Scanner;
public class Main {
    static int fib(int n)
   {
       if(n==1 || n==2)
       {
           return 1;
       }
       return fib(n-1) + fib(n - 2);
   }
    
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Eleman Sayisi = ");
       int num = input.nextInt();
       System.out.println(fib(num));
   }
}
