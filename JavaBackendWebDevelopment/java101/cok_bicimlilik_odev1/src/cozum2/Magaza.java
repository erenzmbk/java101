
package cozum2;


public class Magaza {
    public static void main(String[] args) {
        
        Calisan calisanlar[] = new Calisan[7];
    
        calisanlar[0] = new Mudur("Furkan" , "Kartal");
        ((Mudur)calisanlar[0]).setToplamSatis(37000);
        
        calisanlar[1] = new Tezgahtar("Okan" , "Yesil");
        ((Tezgahtar)calisanlar[1]).setSatis(37000);
        
        calisanlar[2] = new Tezgahtar("Burcu" , "Segmen");
        ((Tezgahtar)calisanlar[2]).setSatis(22000);
        
        calisanlar[3] = new IdariPersonel("Ayse","Demir");
        calisanlar[4] = new IdariPersonel("Mehmet","Celik");
        
        calisanlar[5] = new Hizmetli("Ali" , "Kaya");
        ((Hizmetli) calisanlar[5]).setMesaiSaati(60);
        
        calisanlar[6] = new Hizmetli("Ahmet" ,"Ates");
        ((Hizmetli) calisanlar[6]).setMesaiSaati(40);
        
        
        System.out.println("Calisanlarin Maaslari :");
        for(int i = 0 ; i < calisanlar.length;++i)
        {
            System.out.println(calisanlar[i].getBilgi());
        }
        
    }
}
