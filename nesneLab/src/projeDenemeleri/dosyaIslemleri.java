package projeDenemeleri;


import java.io.*;
import java.nio.file.AtomicMoveNotSupportedException;
import java.util.ArrayList;

public class dosyaIslemleri {

    Iller il= new Iller();
    static int sonuc;
    private static int ayrac=0,benzin=0,kapasite;//Tır için 1 Kamyon için 2



    public dosyaIslemleri(int ayrac,int benzin,int kapasite,int bos){

        this.ayrac = ayrac;
        this.benzin = benzin;
        this.kapasite = kapasite;
    }


    public dosyaIslemleri(){}

    public dosyaIslemleri(int bas_il, int bit_il, int is) throws IOException {
            AltIller altIller=new AltIller(bas_il);

            File file = new File(il.iller.get(bas_il)+"-"+altIller.iller.get(bit_il)+".txt");

            if (!file.exists()){
                    file.createNewFile();
            }

            FileWriter fWriter;
                fWriter = new FileWriter(file, true);

            BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write("\n");
        bWriter.write(il.isler.get(is)+"\n");

            bWriter.close();
        }


        public void dosyaOkuma(String bas_il, String bit_il) throws FileNotFoundException,IOException {



            File file = new File(bas_il+"-"+bit_il+".txt");

            FileReader fOku = new FileReader(file);
            BufferedReader bOku = new BufferedReader(fOku);

            String temp;



            if ((temp = bOku.readLine())==null)
            {

                System.out.println("Bu güzergahta mevcut iş yok.");
                bOku.close();

            }

            else
            {

                int i = 1;

                while ((temp = bOku.readLine())!=null)
                {
                    System.out.println(temp);
                }
                bOku.close();
            }








        }




    public static class Alcitasi extends  IsAbstract{

        int tonUcreti;


        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk
            add(442);//ankara ist
            add(854);//ankara sanlıurfa
            add(587);//ankara izmir
            add(301);//esk ist
            add(1020);//esk urfa
            add(500);//esk izmir
            add(1282);//ist urfa
            add(479);//ist izmir
            add(1257);//urfa izmir

        }};

        @Override
        public void hesaplama(int guzergah)
        {
            tonUcreti=350;

            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }
    }

    public static class Fayans extends  IsAbstract{

        int tonUcreti;



        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk
            add(442);//ankara ist
            add(854);//ankara sanlıurfa
            add(587);//ankara izmir
            add(301);//esk ist
            add(1020);//esk urfa
            add(500);//esk izmir
            add(1282);//ist urfa
            add(479);//ist izmir
            add(1257);//urfa izmir

        }};

        @Override
        public void hesaplama(int guzergah) {

            tonUcreti=500;
            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }
    }

    public static class Demir extends  IsAbstract{



        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk
            add(442);//ankara ist
            add(854);//ankara sanlıurfa
            add(587);//ankara izmir
            add(301);//esk ist
            add(1020);//esk urfa
            add(500);//esk izmir
            add(1282);//ist urfa
            add(479);//ist izmir
            add(1257);//urfa izmir

        }};

        @Override
        public void hesaplama(int guzergah) {
            int tonUcreti=450;
            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }
    }

    public static class Alci extends  IsAbstract{

        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk
            add(442);//ankara ist
            add(854);//ankara sanlıurfa
            add(587);//ankara izmir
            add(301);//esk ist
            add(1020);//esk urfa
            add(500);//esk izmir
            add(1282);//ist urfa
            add(479);//ist izmir
            add(1257);//urfa izmir

        }};

        @Override
        public void hesaplama(int guzergah) {
            int tonUcreti=400;
            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }


    }

    public static class Mermer extends  IsAbstract{

        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk
            add(442);//ankara ist
            add(854);//ankara sanlıurfa
            add(587);//ankara izmir
            add(301);//esk ist
            add(1020);//esk urfa
            add(500);//esk izmir
            add(1282);//ist urfa
            add(479);//ist izmir
            add(1257);//urfa izmir

        }};

        @Override
        public void hesaplama(int guzergah) {
            int tonUcreti=500;
            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }

    }

    public static class Isot extends  IsAbstract{

        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk
            add(442);//ankara ist
            add(854);//ankara sanlıurfa
            add(587);//ankara izmir
            add(301);//esk ist
            add(1020);//esk urfa
            add(500);//esk izmir
            add(1282);//ist urfa
            add(479);//ist izmir
            add(1257);//urfa izmir

        }};

        @Override
        public void hesaplama(int guzergah) {
            int tonUcreti=250;
            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }



    }

    public static class Biber extends  IsAbstract{

        ArrayList<Integer> kmTutucu = new ArrayList<Integer>(){{

            add(277);//ankara esk 0
            add(442);//ankara ist 1
            add(854);//ankara urfa 2
            add(587);//ankara izmir 3
            add(301);//esk ist 4
            add(1020);//esk urfa 5
            add(500);//esk izmir 6
            add(1282);//ist urfa 7
            add(479);//ist izmir 8
            add(1257);//urfa izmir 9

        }};

        @Override
        public void hesaplama(int guzergah) {
            int tonUcreti=150;
            sonuc=((kapasite*tonUcreti)+kmTutucu.get(guzergah)-((kmTutucu.get(guzergah)/100)*benzin));
            System.out.println("Bu işten kazancınız: "+degerDondur(sonuc));
        }

        @Override
        public int degerDondur(int sonuc){
            return sonuc;
        }


    }

}


