public class BankBCA extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah 4.5%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di BCA");
    }
    @Override
    public void infoBank() {
        System.out.println("Bank BCA - Terpercaya sejak 1957.");
    }

}
