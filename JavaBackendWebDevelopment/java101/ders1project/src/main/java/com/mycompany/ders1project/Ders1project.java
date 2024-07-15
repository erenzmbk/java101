/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ders1project;

/**
 *
 * @author Eren Zambak
 */
public class Ders1project {

    public static void main(String[] args) {
        zaman zamanNesnesi1;
        zamanNesnesi1 = new zaman(Byte.valueOf("1"),Byte.valueOf("15"),Byte.valueOf("30"));
        byte s=23 , d=45, sn=50;
        zaman zamanNesnesi2 = new zaman(s,d,sn);
        
        zamanNesnesi1.ilerle();
        System.out.println("Zaman nesnesi 1 degeri : ");
        zamanNesnesi1.yazdir();
        System.out.println("Zaman nesnesi 2 degeri : ");
        for(int i=1;i<=10;i++) {
        zamanNesnesi2.ilerle();
        zamanNesnesi2.yazdir();
        }
       
        zamanNesnesi1.yazdir();
        
    }
}
