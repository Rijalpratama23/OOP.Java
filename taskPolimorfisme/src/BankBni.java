public class BankBni extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di BNI");
    }
    @Override
    public void infoBank() {
        System.out.println("Bank BNI - Melayani dengan sepenuh hati.");
    }
}
