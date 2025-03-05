public class BujurSangkar extends BangunDatar {
    double sisi;

    public BujurSangkar(double sisi) {
        super("Bujur Sangkar");
        this.sisi = sisi;
    }

    
    public double HitungLuas() { 
        return sisi * sisi;  // hitung luas bujur sangkar
    }

    
    public double HitungKeliling() {
        return 4 * sisi;  // hitung bujur sangkar
    }
}
