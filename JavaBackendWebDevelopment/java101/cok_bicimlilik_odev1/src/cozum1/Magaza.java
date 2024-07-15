
package cozum1;


public class Magaza {
    private final static int MUDUR_CIPLAK_MAASI = 2000;
    private final static int MUDUR_PRIM_LIMITI = 20000; 
    private final static int HIZMETLI_SAATLIK_UCRET= 10; 
    private final static int IDARI_PERSONEL_MAASI = 800;
    
    public static void main(String[] args) {
        
        Hizmetli[] hizmetliler = new Hizmetli[2];
        hizmetliler[0] = new Hizmetli("Ali" , "Kaya");
        hizmetliler[0].setMaas(HIZMETLI_SAATLIK_UCRET *60);
        hizmetliler[1] = new Hizmetli("Ahmet", "Ates");
        hizmetliler[1].setMaas(HIZMETLI_SAATLIK_UCRET *40);
        
        IdariPersonel[] idariPersoneller = new IdariPersonel[2];
        idariPersoneller[0] = new IdariPersonel("Ayse" , "Demir");
        idariPersoneller[0].setMaas(IDARI_PERSONEL_MAASI);
        idariPersoneller[1] = new IdariPersonel("Mehmet" , "Celik");
        idariPersoneller[1].setMaas(IDARI_PERSONEL_MAASI);
        
        Tezgahtar[] tezgahtarlar = new Tezgahtar[2];
        tezgahtarlar[0] = new Tezgahtar("Okan", "Yesil");
        tezgahtarlar[0].setMaas(15000 / 10);
        tezgahtarlar[1] = new Tezgahtar("Burcu" , "Segmen");
        tezgahtarlar[1].setMaas(22000 / 10);
        
        
        Mudur mudur = new Mudur("Furkan" , "Kartal");
        mudur.setMaas((37000 - MUDUR_PRIM_LIMITI) / 10 + MUDUR_CIPLAK_MAASI);
        
        
        System.out.println("Calisanlarin maaslari : ");
        System.out.println(mudur.getBilgi());
        
        for (int i = 0 ; i < tezgahtarlar.length ; ++i) {
            System.out.println(tezgahtarlar[i].getBilgi());
        }
        
        for (int i = 0; i < idariPersoneller.length; ++i) { 
            System.out.println(idariPersoneller[i].getBilgi()); 
        } 
        for (int i = 0; i < hizmetliler.length; ++i) { 
            System.out.println(hizmetliler[i].getBilgi()); 
        }
    }
}
