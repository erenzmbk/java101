/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ders1project;

/**
 *
 * @author Eren Zambak
 */
public class zaman {
    byte saat;
    byte dakika;
    byte saniye;
    
    
    zaman(byte saat, byte dakika, byte saniye) {
        saat = saat;
        dakika = dakika;
        saniye= saniye;
    }
    
    void  ilerle() {
        saniye++;
        if(saniye == 60) {
            saniye =0;
            dakika++;
            if(dakika == 60) {
                dakika=0;
                saat++;
                if(saat == 24) {
                    saat =0;
                }
            }
        }
        //System.out.println("Saat : " + saat + "dakika:"+dakika +"saniye: " + saniye);
    }
    
    void yazdir(){
        System.out.println("Saat : " + saat + "dakika:"+dakika +"saniye: " + saniye);
    }
}

//const (kurucu) :  Nesnenin durumunun tutarsız hale gelmesine izin vermez (yazılmazsa boş const üretir)