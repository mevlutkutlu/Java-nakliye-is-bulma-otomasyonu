package projeDenemeleri;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsanKarsilamaEkrani {



    String temp;


    Scanner oku = new Scanner(System.in);
    public void karsilama() throws FileNotFoundException {

        String ad,soyad;


        System.out.print("Adinizi giriniz: ");

        ad = oku.nextLine();
        System.out.print("Soyadinizi giriniz: ");
        soyad = oku.nextLine();

        Insan insan = new Insan(ad,soyad);

        aracBilgisiAlma();


    }

    public void aracBilgisiAlma() throws FileNotFoundException {

        System.out.print("Plakanızı giriniz: ");
        temp = oku.nextLine();

        Tir tir = new Tir(temp);
        Kamyon kamyon = new Kamyon(temp);

        aracSectirme();

    }

    public void aracSectirme() throws FileNotFoundException {


        System.out.print(
                "Kullandığınız aracı tuşlayın:\n"
                +"Tır için:1\n"
                +"Kamyon için:2\n");


        int i=1;
        while(i==1){

            temp=oku.nextLine();

            switch (temp) {



                case "1":
                    Tir tir = new Tir();
                    tir.markaModelIsteme();
                    tir.aracOzelligiIsteme();


                    i=0;
                    break;

                case "2":
                    Kamyon kamyon = new Kamyon();
                    kamyon.markaModelIsteme();
                    kamyon.aracOzelligiIsteme();


                    i=0;
                    break;

                default:
                    System.out.println("Geçersiz sayı girdiniz.");
                    break;

            }


        }
        IsListesi liste = new IsListesi();
        liste.Islistele();

    }

}
