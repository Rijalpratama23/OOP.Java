public class ObjekMobil {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        Mobil m2 = new Mobil();

        // pengambilan method setDataMobil(), dari file Mobil.java
        m1.setDataMobil("Avanza", "merah", 0);
        m2.setDataMobil("Iconic", "biru", 0);

        // tambah kecepatan 
        m1.TurnOnMobil(true);
        m1.MobilInfo(10);
        m1.MobilInfo(20);
        m1.MobilInfo(10);

        // pengambilan method infoMobil(), dari file Mobil.java
        m1.infoMobil();
        m2.infoMobil();
    }
}
