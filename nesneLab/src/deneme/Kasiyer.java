package deneme;

import java.util.Scanner;

public class Kasiyer {



    public Kasiyer(String isim){

        Kasa kasa1 = new Kasa(isim);
        isVakti();
    }

    public void isVakti(){

        Kasa kasa2 =new Kasa();

        System.out.println("Almak istediiginiz urunu seciniz:");
        System.out.println("1-Salata --> 100 tl");
        System.out.println("2-Hamburger --> 100 tl");
        System.out.println("3-Pizza --> 100 tl");
        System.out.println("4-Tatli --> 100 tl");
        System.out.println("Cıkmak icin 5 giriniz.");

        int i=0,j=1;
        Scanner oku = new Scanner(System.in);

        while (j!=0){

            i= oku.nextInt();
            switch (i) {



                case 1:
                    kasa2.hesapla(1,100);


                    break;

                case 2:
                    kasa2.hesapla(2,100);

                    break;

                case 3:

                    kasa2.hesapla(3,100);
                    break;

                case 4:

                    kasa2.hesapla(4,100);
                    break;

                case 5:
                    j=0;

                    break;

                default:
                    System.out.println("Gecersiz bir sayi girdiniz.");



            }



        }

        kasa2.fisYazdir();
    }

}
