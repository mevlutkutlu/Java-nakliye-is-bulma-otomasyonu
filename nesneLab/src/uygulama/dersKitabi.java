package uygulama;

public class dersKitabi extends kitap {

    private String konu;

    public String getKonu()
    {
        return konu;
    }

    public void setKonu(String konu)
    {
        this.konu=konu;
    }

    public void reset(String yeniIsim,String yeniKonu)
    {
        setKitapIsmi(yeniIsim);
        this.konu=yeniKonu;

    }


    public void ciktiYaz()
    {
        System.out.println(getKitapIsmi());
        System.out.println(konu);
    }


}
