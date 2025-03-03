public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;  // Menghitung luas persegi panjang
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);  // Menghitung keliling persegi panjang
    }
}
