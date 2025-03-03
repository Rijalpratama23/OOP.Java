public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double HitungLuas() {
        return panjang * lebar;  // Menghitung luas persegi panjang
    }


    public double HitungKeliling() {
        return 2 * (panjang + lebar);  // Menghitung keliling persegi panjang
    }
}
