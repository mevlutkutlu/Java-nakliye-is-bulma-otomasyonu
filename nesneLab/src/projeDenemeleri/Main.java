package projeDenemeleri;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.print("1-) İşçi \n2-) İşveren \nSeçiniz: ");
        Scanner oku= new Scanner(System.in);
        int insan = oku.nextInt();

        if (insan==1)
        {
            InsanKarsilamaEkrani d1 = new InsanKarsilamaEkrani();
            d1.karsilama();
        }
        else if (insan==2)
        {

            Iller il = new Iller();
            il.ilListesi();
            il.secim();
        }
















    }
}
