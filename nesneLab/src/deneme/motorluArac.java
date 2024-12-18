package deneme;

public abstract class motorluArac {

    int beygirGucu;
    benzin b;
    motor mm;

    public motorluArac(){
        arizaKontrol();
        b = new benzin("motorin");
        mm = new motor();
    }

    abstract void motorCalistir (int a);

    boolean arizaKontrol(){

        System.out.println("Arıza yok.");

        return true;
    }



}
