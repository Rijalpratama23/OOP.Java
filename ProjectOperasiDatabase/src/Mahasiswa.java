public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private int usia;

    public Mahasiswa(String nim, String nama, String jurusan, int usia) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.usia = usia;
    }

    // get
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public int getUsia() {
        return usia;
    }

    // set
    // GANTI BARIS INI: public void setName(String nama) {
    public void setNama(String nama) { // Huruf 'N' diubah menjadi huruf besar 'N'
        this.nama = nama;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan + ", Usia: " + usia;
    }
}