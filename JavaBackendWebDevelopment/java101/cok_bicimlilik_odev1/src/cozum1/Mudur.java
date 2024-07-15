
package cozum1;

public class Mudur {
    private String ad;
    private String soyad;
    private int maas;
    
    public Mudur(String ad, String soyad)
    {
        this.ad = ad;
        this.soyad = soyad;
    }
    
    public String getAd() {
        return ad;
    }
    
    public String getSoyad() {
        return soyad;
    }
    
    public void setMaas(int maas) {
        this.maas = maas;
    }
    
    public String getBilgi() {
        return "Mudur : " + this.ad + " " + this.soyad + ", bu ay " + this.maas + " TL alacaktir";
    }
    
    
}
