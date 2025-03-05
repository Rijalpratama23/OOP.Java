public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double HitungLuas() {
        return panjang * lebar;  // hitung luas segi pnjang
    }


    public double HitungKeliling() {
        return 2 * (panjang + lebar);  // hitung keliling persegi panjang
    }
}
