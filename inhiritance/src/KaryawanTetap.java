public class KaryawanTetap extends Karyawan {
    double gajiPerHari;
    int jmlMasuk;
    public Karyawan(String nama, double tunjangan){
        super(nama,tunjangan);
        gajiPerHari = 20000;
    }

    public void setKaryawanKontrak(double gph, int jmlMasuk) {
        gajiPerHari = gph;
        this.jmlMasuk = jmlMasuk;
    }

    public double getGaji() {
        double total = (gajiPerHari * jmlMasuk) + super.getTunjangan();
        return total;
    }

    public void infoKaryawan() {
        System.out.println("Nama :" + super.getNama());
        System.out.println("Gaji/Hari :" + gajiPerHari);
        System.out.println("Jumlah Masuk :" + jmlMasuk);
        System.out.println("Total Gaji :" + getGaji());
    }
}

