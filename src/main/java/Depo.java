import java.util.Scanner;

public class Depo {

   static Scanner input = new Scanner(System.in);

    public static void anaMenu(){

String tercih = "";
        do{
        System.out.println("-------------------ANA MENU--------------------");
        System.out.println("" +
                "\n"+
                "\t     1- URUN GIRISI\n"+
                "\t     -----------------------\n"+
                "\t     2- URUN GUNCELLE\n"+
                "\t     -----------------------\n"+
                "\t     3- URUNLERI LISTELE\n"+
                "\t     -----------------------\n"+
                "\t     4- URUN CIKISI\n"+
                "\t     -----------------------\n"+
                "\t     Q- PROGRAMI SONLANDIR\n");
        System.out.println("Lutfen Yappmak istediginiz islemi seciniz...");

            Methods01 uruns = new Methods01();
        tercih=input.nextLine();
        switch (tercih){
            case "1" : //Urun girisi yapilmali ve gerekli bilgiler girilmeli

                   uruns.urunTanimlama();

                   break;
            case "2" : //ID numarasai ile secilen urunnun istenilen yeri guncellenebilmeli

                break;
            case "3" : //Depodaki tum urunlerin bilgileri ile yansitacak
                break;
            case "4" : //id numarasi girilen urunun istenilen miktar kadari azalacak eger elde okdar yoksa info verecek
                break;
            case"q":
            case"Q":
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih giriniz...");
        }




        }while (!tercih.equalsIgnoreCase("q"));

Depo.PogramiSonlandir();

    }

    public static void PogramiSonlandir() {
        System.out.println("Program Sonlandirildi...");
    }


}

