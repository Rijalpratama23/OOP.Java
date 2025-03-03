public class BujurSangkar extends BangunDatar {
    double sisi;

    public BujurSangkar(double sisi) {
        super("Bujur Sangkar");
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() { 
        return sisi * sisi;  // Menghitung luas bujur sangkar
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;  // Menghitung keliling bujur sangkar
    }
}
