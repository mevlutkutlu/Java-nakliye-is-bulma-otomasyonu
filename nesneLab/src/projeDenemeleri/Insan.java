package projeDenemeleri;

public class Insan {


    Insan(String ad , String soyad)
    {
        this.ad = ad;
        this.soyad = soyad;
    }

    private String ad,soyad;



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void ciktiyaz(){

        System.out.println("Ad Soyad: "+ad+" "+soyad);


    }




}
