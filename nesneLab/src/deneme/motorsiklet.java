package deneme;

public class motorsiklet extends motorluArac implements suratMotoru,arac {

    void sur (int a){
        System.out.println("void sur(int a) calışıyor");
    }

    void motorcalistir(){

        System.out.println("motorcalistir() calışıyor:");
        motorCalistir(5);

    }

    @Override
    void motorCalistir(int a) {

        System.out.println("motorcalistir(int a) calışıyor");
        arizaKontrol();
    }

    @Override
    public void cokHizyap() {
        System.out.println("cokHizyap() calışıyor");
    }

    @Override
    public void solaSagaDon() {
        System.out.println("solaSagaDon() çalışıyor");
    }


    @Override
    public void sur() {
        System.out.println("Sur() çalışıyor");
    }
}
