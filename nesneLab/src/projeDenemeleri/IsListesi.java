package projeDenemeleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IsListesi {



    public void Islistele() throws FileNotFoundException {


        System.out.println(
                """
                        1) Ankara - İstanbul
                        2) Ankara - Eskişehir
                        3) Ankara - İzmir
                        4) Ankara - Şanlıurfa
                        5) İstanbul - Eskişehir
                        6) İstanbul - İzmir
                        7) İstanbul - Şanlıurfa
                        8) Eskişehir - İzmir
                        9) Eskişehir - Şanlıurfa
                        10) İzmir - Şanlıurfa
                        11) İstanbul - Ankara
                        12) Eskişehir - Ankara
                        13) İzmir - Ankara
                        14) Şanlıurfa - Ankara
                        15) Eskişehir - İstanbul
                        16) İzmir - İstanbul
                        17) Şanlıurfa - İstanbul
                        18) İzmir - Eskişehir
                        19) Şanlıurfa - Eskişehir
                        20) Şanlıurfa - İzmir""");


        guzergahsecimi();

    }

    public void guzergahsecimi() throws FileNotFoundException {

        System.out.println("Secmek istediginiz güzergahı tuşlayınız");
        Scanner oku = new Scanner(System.in);
        int secim = oku.nextInt();

        dosyaIslemleri d1 = new dosyaIslemleri();
        Iller deneme1 = new Iller();



        switch (secim){



            case 1:
                System.out.println("Ankara - İstanbul");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(0),deneme1.iller.get(2));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(1);
                break;
            case 2:
                System.out.println("Ankara - Eskişehir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(0),deneme1.iller.get(1));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(0);
                break;
            case 3:
                System.out.println("Ankara - İzmir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(0),deneme1.iller.get(4));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(3);
                break;

            case 4:
                System.out.println("Ankara - Şanlıurfa");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(0),deneme1.iller.get(3));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(2);
                break;
            case 5:
                System.out.println("İstanbul - Eskişehir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(2),deneme1.iller.get(1));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(4);
                break;
            case 6:
                System.out.println("İstanbul - İzmir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(2),deneme1.iller.get(4));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(8);
                break;
            case 7:
                System.out.println("İstanbul - Şanlıurfa");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(2),deneme1.iller.get(3));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(7);
                break;
            case 8:
                System.out.println("Eskişehir - İzmir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(1),deneme1.iller.get(4));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(6);
                break;
            case 9:
                System.out.println("Eskişehir - Şanlıurfa");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(1),deneme1.iller.get(3));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(5);
                break;
            case 10:
                System.out.println("İzmir - Şanlıurfa");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(4),deneme1.iller.get(3));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(9);
                break;
            case 11:
                System.out.println("İstanbul - Ankara");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(2),deneme1.iller.get(0));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(1);
                break;
            case 12:
                System.out.println("Eskişehir - Ankara");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(1),deneme1.iller.get(0));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(0);
                break;
            case 13:
                System.out.println("İzmir - Ankara");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(4),deneme1.iller.get(0));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(3);
                break;
            case 14:
                System.out.println("Şanlıurfa - Ankara");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(3),deneme1.iller.get(0));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(2);
                break;
            case 15:
                System.out.println("Eskişehir - İstanbul");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(1),deneme1.iller.get(2));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(4);
                break;
            case 16:
                System.out.println("İzmir - İstanbul");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(4),deneme1.iller.get(2));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(8);
                break;
            case 17:
                System.out.println("Şanlıurfa - İstanbul");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(3),deneme1.iller.get(2));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(7);
                break;
            case 18:
                System.out.println("İzmir - Eskişehir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(4),deneme1.iller.get(1));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(6);
                break;
            case 19:
                System.out.println("Şanlıurfa - Eskişehir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(3),deneme1.iller.get(1));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(5);
                break;
            case 20:
                System.out.println("Şanlıurfa - İzmir");

                try {
                    d1.dosyaOkuma(deneme1.iller.get(3),deneme1.iller.get(4));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                isSecimi(9);
                break;
            default:
                System.out.println("Geçersiz güzergah.");

        }






    }

    public void isSecimi(int guzergah){

        System.out.println("Seçmek istediğiniz işi yazınız:");
        Scanner oku = new Scanner(System.in);
        String bulucu = oku.nextLine();

        if (bulucu.equalsIgnoreCase("alcitasi"))
        {
            dosyaIslemleri.Alcitasi alcitasi = new dosyaIslemleri.Alcitasi();
            alcitasi.hesaplama(guzergah);

        }
        else if (bulucu.equalsIgnoreCase("fayans"))
        {
            dosyaIslemleri.Fayans fayans = new dosyaIslemleri.Fayans();
            fayans.hesaplama(guzergah);
        }
        else if (bulucu.equalsIgnoreCase("demir"))
        {
            dosyaIslemleri.Demir demir = new dosyaIslemleri.Demir();
            demir.hesaplama(guzergah);
        } else if (bulucu.equalsIgnoreCase("alci"))
        {
            dosyaIslemleri.Alci alci = new dosyaIslemleri.Alci();
            alci.hesaplama(guzergah);
        }
        else if (bulucu.equalsIgnoreCase("mermer"))
        {
            dosyaIslemleri.Mermer mermer = new dosyaIslemleri.Mermer();
            mermer.hesaplama(guzergah);
        }
        else if (bulucu.equalsIgnoreCase("isot"))
        {
            dosyaIslemleri.Isot isot = new dosyaIslemleri.Isot();
            isot.hesaplama(guzergah);
        }
        else
        {
            dosyaIslemleri.Biber biber = new dosyaIslemleri.Biber();
            biber.hesaplama(guzergah);
        }

    }





}
