package projeDenemeleri;

public class Tir extends Arac {

    public Tir (){}
    public Tir (String marka,String model){
        super(marka,model);
    }
    public Tir(String plaka){
        super(plaka);
    }
    public static int motorGucu;

    @Override
    public void aracOzelligiIsteme()
    {

        System.out.print("Aracınızın motor gücünü giriniz (480-460-430): ");
        motorGucu=oku.nextInt();
        if(motorGucu==480)
        {
            dosyaIslemleri ayracBenzin = new dosyaIslemleri(1,33,20,0);
        }
        else if(motorGucu==460)
        {
            dosyaIslemleri ayracBenzin = new dosyaIslemleri(1,35,20,0);
        }
        else
        {
            dosyaIslemleri ayracBenzin = new dosyaIslemleri(1,30,20,0);
        }
    }






}
