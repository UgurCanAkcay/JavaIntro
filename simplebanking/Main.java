package odevuc_soruıki;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banka hesapone=new Banka();
        hesapone.hesapBilgileri("SAMSUN",555);
        hesapone.hesapBilgileri("UGUR",0);
        hesapone.hesapBilgileri("CAN",333);
        
        Scanner girdi=new Scanner(System.in);
        System.out.println("Welcome to SamCanUgur Bank ..."+"\n"+"Para yatirmak için referans kodu giriniz...");

        String user_girdigi_referanskodu=girdi.nextLine();
        System.out.println("1- 10 tl yatirmak için" +"\n"+ "2- 50 tl yatırmak için" +"\n"+"press 1 or 2 ");
        
        int u=girdi.nextInt();
        if(u==1) {
            hesapone.ReferansDogrulugu(user_girdigi_referanskodu, 10);
        }
            else if(u==2)
            {
                hesapone.ReferansDogrulugu(user_girdigi_referanskodu,50);
            }
            else
            {
                System.out.println("Yanlış bir değer girdiniz..");
            }
        hesapone.HesapBilgileriniYazdir();
}