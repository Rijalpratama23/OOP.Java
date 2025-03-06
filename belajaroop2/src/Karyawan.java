public class Karyawan {
    String nama;
    double gajiPokok;
    double tunjangan;

    // ini konstructor pertama dengan 3 paramenetr
    public Karyawan(String nama, double gapok, double tunjangan) {
        this.nama = nama;
        gajiPokok = gapok;
        this.tunjangan = tunjangan;
    }

    // constructor kedua dengan 2 parameter
    public Karyawan(String nama, double tunjangan) {
        this.nama = nama;
        this.tunjangan = tunjangan;
    }

    // SET data kryawan
    public void setDataKaryawan(String nm, double gp, double tj) {
        nama = nm;
        gajiPokok = gp;
        tunjangan = tj;
    }

    // Get
    public String getNama() {
        return nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public double getTunjangan() {
        return tunjangan;
    }
}

