
package cozum2;

public class IdariPersonel extends Calisan {
    private static final int MAAS = 800;
    
    public IdariPersonel(String ad, String soyad) {
        super(ad,soyad);
    }
    
    public int maasHesapla() {
        return IdariPersonel.MAAS;
    }    
    
    public String kimimBen() {
        return "Idari Personel";
    }
}
