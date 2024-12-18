package projeDenemeleri;

import java.util.Scanner;

public class Arac {

    public Arac(){}
    public Arac(String marka,String model){
        this.marka = marka;
        this.model = model;
    }
    public Arac(String plaka){

        this.plaka = plaka;
    }


    public static String plaka,marka,model;
    Scanner oku = new Scanner(System.in);


    public void markaModelIsteme(){
        System.out.print("Aracınızın markasını giriniz: ");
        marka = oku.nextLine();

        System.out.print("Aracınızın modelini giriniz: ");
        model = oku.nextLine();

    }

    public void ciktiyaz(){
        System.out.println("Plaka: "+plaka
                +" \nMarka: "+marka
                +" \nModel: "+model);
    }


    public void aracOzelligiIsteme(){}

    int yaktigibenzinibulma(){


        return 0;
    }



}
