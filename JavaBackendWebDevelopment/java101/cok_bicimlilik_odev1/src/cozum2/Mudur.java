
package cozum2;

public class Mudur extends Calisan {
    private static final int CIPLAK_MAAS = 2000;
    private static final int PRIM_LIMITI = 2000;
    
    private int satis;
    
    public Mudur(String ad, String soyad) {
        super(ad,soyad);
    }
    
    public void setToplamSatis(int satis){
        this.satis = satis;
    }
    
    @Override
    public int maasHesapla() 
    {
        if(this.satis > Mudur.PRIM_LIMITI) 
        {
            return CIPLAK_MAAS + 
                    (this.satis - Mudur.PRIM_LIMITI) / 10;
        }
        return CIPLAK_MAAS;
    }
    
    
    @Override
    public String kimimBen() {
        return "Mudur";
    }
    
    
}

