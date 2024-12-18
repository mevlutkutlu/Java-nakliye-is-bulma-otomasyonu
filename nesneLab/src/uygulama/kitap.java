package uygulama;

public class kitap {

    private String kitapIsmi;

    public  String getKitapIsmi()
    {

        return kitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi)
    {
        this.kitapIsmi=kitapIsmi;

    }

    public void ciktiYaz()
    {
        System.out.println(kitapIsmi);
    }






}
