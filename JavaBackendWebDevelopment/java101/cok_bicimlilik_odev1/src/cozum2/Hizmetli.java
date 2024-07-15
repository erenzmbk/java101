
package cozum2;

public class Hizmetli extends Calisan {
    private static final int SAAT_UCRETİ = 10;
    private int mesaiSaati;
    
    public Hizmetli(String ad, String soyad) {
        super(ad, soyad);
    }
    
    public void setMesaiSaati(int mesaiSaati){
        this.mesaiSaati = mesaiSaati;
    }
    
    public int maasHesapla() {
        return this.mesaiSaati * Hizmetli.SAAT_UCRETİ;
    }
    
    public String kimimBen() {
        return "Hizmetli";
    }
    
    
    
}
