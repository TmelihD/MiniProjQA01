import jdk.dynalink.beans.StaticClass;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods01 extends PojoUrun {
    static Scanner input = new Scanner(System.in);

    public static void urunGiris(){
        System.out.println("Urunun ismini giriniz.");
        String girilenUrun = input.nextLine();

        System.out.println("Uretici Ismi Giriniz");
        String girilenUretici = input.nextLine();

        ArrayList<String> urun = new ArrayList<>();
        urun.add(girilenUrun);
        urun.add(girilenUretici);
        System.out.println(urun);


    }


}
