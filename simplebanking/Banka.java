package odevuc_soruıki;
public class Banka {
int x=0;
    Boolean matrix[][]=new Boolean[3][5];
    Hesap[] hesaplar = new Hesap[3];
    String[] referansKodlari = new String[]
            {"ugur","can ","akcay","samsun","55"};

    public Banka() {
        x=0;
      matrix[0][0] = false; matrix[0][1] = true; matrix[0][2] = false; matrix[0][3]= false; matrix[0][4]= false;
        matrix[1][0] = true; matrix[1][1] = false; matrix[1][2] = false; matrix[1][3]= true; matrix[1][4]= false;
        matrix[2][0] = false; matrix[2][1] = false; matrix[2][2] = true; matrix[2][3]= false; matrix[2][4]= true;

    }


public void hesapBilgileri(String isim,float HesapBakiyesi) {
    Hesap hesapp = new Hesap();
    hesapp.setHesapAdi(isim);
    hesapp.setHesapBakiyesi(HesapBakiyesi);
    hesaplar[x] = hesapp;
    x++;
}
    public void HesapBilgileriniYazdir() {

        for (int i = 0; i<hesaplar.length; i++) {
            System.out.println("hesap adı: " + hesaplar[i].getHesapAdi() + "  Hesap Bakiyesi: " + hesaplar[i].getHesapBakiyesi());

        }
    }
        public void ReferansDogrulugu(String lul,float u)

        {
            for(int m=0;m<hesaplar.length;m++){
                for(int n=0;n<referansKodlari.length;n++)
                    if(matrix[m][n]==true){
                        if(lul.equals(referansKodlari[n])){
                            hesaplar[m].ParaYatir(u);
                        }
                    }
            }



        }

}