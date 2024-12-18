
package projeDenemeleri;
public class AltIller extends Iller {

    AltIller(){
    }

    AltIller(int sayi) {
        iller.remove(iller.get(sayi));
    }

    @Override
    public void ilListesi() {
        super.ilListesi();
    }

    @Override
    public void ilYazdir(int il2) {
        System.out.print(iller.get(il2)+"\n");
    }
}
