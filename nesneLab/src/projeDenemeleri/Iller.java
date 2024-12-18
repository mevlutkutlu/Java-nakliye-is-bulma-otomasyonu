package projeDenemeleri;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Iller {


    ArrayList<String> iller = new ArrayList<>()
    {
        {
            add("Ankara");
            add("Eskişehir");
            add("İstanbul");
            add("Şanlıurfa");
            add("İzmir");
        }
    };

    ArrayList<String> isler = new ArrayList<>()
    {
        {
            add("Alçıtaşı");
            add("Fayans");
            add("Demir");
            add("Mermer");
            add("Alçı");
            add("İsot");
            add("Biber");
        }
    };



    public Iller() {
    }

    public void ilListesi() {
        for (int i = 0; i < iller.size(); i++) {
            System.out.println(i + 1 + ".il =" + iller.get(i));
        }
    }

    public void isListesi() {
        for (int i = 0; i < isler.size(); i++) {
            System.out.println(i + 1 + ".iş =" + isler.get(i));
        }
    }




    public void secim() throws IOException {//Bu eleman işverene özgü olacak.
        System.out.print("Başlangıç ilini seçiniz: ");

        Scanner oku = new Scanner(System.in);
        int il1 = (oku.nextInt() - 1);

        AltIller altIller = new AltIller(il1);
        altIller.ilListesi();

        System.out.print("Bitiş ilini seçiniz: ");
        int il2 = (oku.nextInt() - 1);

        ilYazdir(il1);
        altIller.ilYazdir(il2);

        isListesi();
        System.out.print("Lütfen iş seçiniz: ");
        int is=(oku.nextInt()-1);

        dosyaIslemleri dosya = new dosyaIslemleri(il1,il2,is);

    }

    public void ilYazdir(int il1){
        System.out.print("Seçtiğiniz iller: "+ iller.get(il1)+" - ");
    }

    }
