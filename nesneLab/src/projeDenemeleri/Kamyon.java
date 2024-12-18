package projeDenemeleri;

public class Kamyon extends Arac {

    public Kamyon(){}
    public Kamyon (String marka,String model){
        super(marka,model);
    }

    public Kamyon(String plaka) {
        super(plaka);
    }
    public static int dingilSayisi;

    @Override
    public void aracOzelligiIsteme()
    {
        System.out.print("Aracınızın dingil sayısını giriniz(3 veya 4): ");
        dingilSayisi = oku.nextInt();

        if (dingilSayisi==3)
        {
            dosyaIslemleri ayracBenzin = new dosyaIslemleri(2,25,12,0);
        }
        else
        {
            dosyaIslemleri ayracBenzin = new dosyaIslemleri(2,27,16,0);
        }

    }


}
