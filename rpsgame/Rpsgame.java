package rpsgame;
import java.util.Scanner;
import java.util.Random;
 
class Kisi {
 
 Kisi(){   
 
   Scanner scan = new Scanner(System.in);
 
   System.out.println("Player Adını Giriniz: ");
   this.name = scan.next();
   System.out.println("Kaç turn olsun?? :");
   this.tur = scan.nextInt();
 
 }
 
 String name = "";
 String secim = "";
 int tur=0;
 int skor=0;
 
}
 
class Hareket {
 
 Scanner scan = new Scanner(System.in);
 Kisi Player = new Kisi();
 
 public void start(){
 
 String BilgisayarinSecimi = " ";
 
 int Produce;
 int skorPC = 0;
 
 for (int i = 0; i < Player.tur; i++) {
   System.out.println("Lütfen seçim Yapınız.. for Rock 'R', for Paper 'P', Scissors için 'S'");
 
   Random uret = new Random();
   Produce = uret.nextInt(3)+1;
 
 
   if (Produce == 1) BilgisayarinSecimi = "R";
   else if (Produce == 2) BilgisayarinSecimi = "P";
   else if (Produce == 3) BilgisayarinSecimi= "S";
   System.out.println("Seçiminizi Yapınız: ");
   Player.secim = scan.next();
 
   Player.secim = Player.secim.toUpperCase();
 
   System.out.println("Bilgisayarın Seçimi: " + BilgisayarinSecimi);
 
   if(Player.secim.equals(BilgisayarinSecimi))
   {
   System.out.println("Berabere..");
   }
  else if (Player.secim.equals("R"))
  {
       if (BilgisayarinSecimi.equals("S"))
       {
           System.out.println("Kazandınız..");
           Player.skor++;
       }
   else if (BilgisayarinSecimi.equals("P"))
   {
       System.out.println("Kaybettiniz..");
           skorPC++;
    }       
  }
else if (Player.secim.equals("P"))
{
   if (BilgisayarinSecimi.equals("S"))
   {
        System.out.println("Kaybettiniz..");
             skorPC++;
   }
       else if (BilgisayarinSecimi.equals("R"))
   {
            System.out.println("Kazandınız..");
             Player.skor++;
   }
}
else if (Player.secim.equals("S"))
{
    if (BilgisayarinSecimi.equals("P"))
    {
        System.out.println("Kazandınız..");
             Player.skor++;
        }
        else if (BilgisayarinSecimi.equals("R"))
        {
            System.out.println("Kaybettiniz.."); 
            skorPC++;
        }
        else
   {
        System.out.println("Lütfen tekrar deneyiniz..");
   }
}
       }
 
       System.out.println("☺The End☺---- \n\n Sizin Skorunuz: " + Player.skor + "\nBilgisayarın Skoru: "+ skorPC +"\nKAZANAN: ");
 
 
       if (skorPC > Player.skor)
       {
          System.out.println("Bilgisayar !");  
       }
       else if (skorPC < Player.skor)
       {
           System.out.println(Player.name + " oldu !.");
       }
       else
       {
           System.out.println("Kazanan Çıkmadı... OYUN BERABERE BİTTİ !");
       }
 }
 
}
 
class Rpsgame
{
 public static void main(String[] args) {
 
   Hareket game = new Hareket();
  
   game.start();
 
    
  
    
 }
}


