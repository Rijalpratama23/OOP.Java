public class BangunDatar {
    String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public double hitungLuas() {
        return 0; // Default, akan di-override di subclass
    }

    public double hitungKeliling() {
        return 0; // Default, akan di-override di subclass
    }
}
