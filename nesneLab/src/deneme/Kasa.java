package deneme;

public class Kasa {


    public Kasa(String isim)
    {
        System.out.println("Hos geldin"+" "+isim);
    }

    public Kasa(){
        System.out.println("Hos geldiniz.");
    }


    static int tatliSayisi=0,salataSayisi=0;
     double gunlukKar=0;
    static double topSatisMiktari,salataKar=0;

    public void hesapla(int secim,double fiyat)
    {
        topSatHesapla(fiyat);
        gunlukKarHesapla(secim,fiyat);
    }

    private void topSatHesapla(double fiyat){


        topSatisMiktari=topSatisMiktari+fiyat;
    }

    private void gunlukKarHesapla(int secim,double fiyat){

        switch (secim){
            case 1:
                salataKari(100*30/100);
                gunlukKar=gunlukKar+(100*30/100);
            break;

            case 2:
                gunlukKar=gunlukKar+(100*25/100);

            case 3:
                gunlukKar=gunlukKar+(100*35/100);

            case 4:
                tatliSayisiArttir();
                gunlukKar=gunlukKar+(100*20/100);

        }


    }

    private void salataKari(double kar){
        salataKar=salataKar+kar;
    }

    private void tatliSayisiArttir(){
        tatliSayisi=tatliSayisi+1;
    }

    public void fisYazdir(){

        System.out.println("Toplam satis mikrari:"+" "+topSatisMiktari);
        System.out.println("Gunluk kar miktari: "+gunlukKar);
        System.out.println("Salata kari: "+salataKar);
        System.out.println("Tatli sayisi: "+tatliSayisi);

    }


}
