
package cozum2;


public class Tezgahtar extends Calisan {
    private int satis;
    
    public Tezgahtar(String ad, String soyad) {
        super(ad,soyad);
    }
            
    public void setSatis(int satis) {
        this.satis = satis;
    }
    
    public int maasHesapla() {
        return this.satis / 10;
    }
    
    public String kimimBen() {
        return "Tezgahtar";
    }
            
            
            
}
