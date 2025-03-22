public abstract class Bank { // 

    public abstract void infoBank(); 

    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Berita: " + berita);
    }

    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}
