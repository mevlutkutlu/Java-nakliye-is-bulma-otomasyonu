import uygulama.dersKitabi;
import uygulama.kitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String isim,dersisim; //kalıtım uygulaması
        kitap kitap=new kitap();

        dersKitabi deneme=new dersKitabi();

        Scanner oku= new Scanner(System.in);

        System.out.print("Kitap ismi giriniz:");

        isim=oku.nextLine();

        deneme.setKitapIsmi(isim);

        System.out.print("Ders kitabinin ismini giriniz:");

        dersisim=oku.nextLine();
        deneme.setKonu(dersisim);


        deneme.ciktiYaz();*/


        String yanit;
        do{
            Scanner klavye= new Scanner( System.in);
            try{
                System.out.print("Boluneceksayi:\t");
                int a= klavye.nextInt();
                System.out.print("Bolensayi:\t");
                int b=klavye.nextInt();
                if(b==0)
                    throw new Exception ("Kural dışı durum: Bölen sıfır");

                int c=a/b;
                System.out.println();
                System.out.println(a+"/" +b+"=" +c);
            }
            catch(Exception ozelDurum){
                System.out.println();

                System.out.println(ozelDurum.getMessage());
                System.out.println("Bölen sıfır olamaz");
            }
            System.out.println();
            System.out.print("Bir daha denemek ister misin? (e/h)");
                    yanit=klavye.next();
            System.out.println();
        } while((yanit.equals("e")|| (yanit.equals("E"))));
    }

}