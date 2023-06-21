import jdk.dynalink.beans.StaticClass;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods01 extends PojoUrun {
    /*static Scanner input = new Scanner(System.in);

    public static void urunGiris(){
        System.out.println("Urunun ismini giriniz.");
        String girilenUrun = input.nextLine();

        System.out.println("Uretici Ismi Giriniz");
        String girilenUretici = input.nextLine();

        ArrayList<String> urun = new ArrayList<>();
        urun.add(girilenUrun);
        urun.add(girilenUretici);
        System.out.println(urun);



    }*/


   Scanner input = new Scanner(System.in);
    public void urunTanimlama() {

        ArrayList<PojoUrun> urunler = new ArrayList<>();
        System.out.println("Kullanici eklemek istemiyorsaniz 0 i eklemeye devam etmek icin urun adini giriniz");
        do {
            PojoUrun urun = new PojoUrun();

            System.out.println("urunismi");
            urun.setUrunImi(input.next());
            System.out.println("uretici");
            urun.setUreetici(input.next());
            System.out.println("miktar");
            urun.setMiktar(input.nextInt());
            Random rand = new Random();
            int id = rand.nextInt(999999999) + 1;
            urun.setId(id);
            urunler.add(urun);
            System.out.println("Urun ekleme işelemini bırakmak icin 0 i devam etmek icin herhangi bir tusu tiklayiniz");
            if (input.next().equals("0")) {
                break;

            }
            System.out.println(urunler);

        }
        while (true);
        System.out.println(urunler);
    }}