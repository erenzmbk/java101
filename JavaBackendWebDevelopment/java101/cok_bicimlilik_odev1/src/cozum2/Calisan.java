
package cozum2;


public abstract class Calisan {
    private String ad;
    private String soyad;
    
    
    public Calisan(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
    }
    
    public String getAd(){
        return ad;
    }
    
    public String getSoyad(){
        return soyad;
    }
    
    public abstract int maasHesapla();
    
    public String getBilgi(){
        return this.kimimBen() + ": " + this.ad + " " + this.soyad +
                ", bu ay " + this.maasHesapla() + " TL alacaktir.";
    }
    
    public abstract String kimimBen();
    
    
}
