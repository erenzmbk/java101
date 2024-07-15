import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int day, month;
        String burc = "";
               
                
        System.out.print("Dogdugunuz ayi giriniz : ");
        month = input.nextInt();
        
        System.out.print("Dogdugunuz gunu girinz : ");
        day = input.nextInt();
        
        if(month == 1){
            if(day < 22) {
                burc = "Oglak";
            }
            else{
                burc = "Kova";
            }
        }
        if(month == 2) {
            if(day <= 19) {
                burc = "kova";
            }
            else {
                burc = "balik";
            }
        }
        if(month == 3)
            if(day <=20){
                burc = "balik";
            }
            else {
                burc = "koc";
            }
        
        if(month == 4)
            if(day <= 20){
                burc = "koc";
            }
            else {
                burc = "boga";
            }
        if(month == 5)
            if(day <=21){
                burc = "boga";
            }
            else {
                burc = "ikizler";
            }
        if(month == 6)
            if(day <=22 ){
                burc = "ikizler";
            }
            else {
                burc = "yengec";
            }
        if(month == 7)
            if(day <=22){
                burc = "yengec";
            }
            else {
                burc = "aslan";
            }
        if(month == 8)
            if(day <=22){
                burc ="aslan";
            }
            else {
                burc ="basak";
            }
        if(month == 9)
            if(day <=22){
                burc = "basak";
            }
            else {
                burc = "terazi";
            }
        if(month == 10)
            if(day <=22){
                burc = "terazi";
            }
            else {
                burc = "akrep";
            }
        if(month == 11)
            if(day <=21){
                burc = "akrep";
            }
            else {
                burc = "yay";
            }
        if(month == 12)
            if(day <=21){
                burc ="yay";
            }
            else {
                burc ="oglak";
            }
        
       System.out.print("Burcunuz : " + burc);       
    }
    
}
