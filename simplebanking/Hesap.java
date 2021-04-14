package odevuc_soruıki;
public class Hesap{
private float hesapBakiyesi;
private String HesapAdi;

public Hesap(){


}

    public Hesap(float hesapBakiyesi, String hesapAdi) {
        this.hesapBakiyesi = hesapBakiyesi;
        HesapAdi = hesapAdi;
    }
    public String getHesapAdi() {
        return HesapAdi;
    }
     public void setHesapAdi(String hesapAdi) {
        HesapAdi = hesapAdi;
    }

    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void ParaYatir(float yatirilacakTutar)
{
hesapBakiyesi=yatirilacakTutar+hesapBakiyesi;


}