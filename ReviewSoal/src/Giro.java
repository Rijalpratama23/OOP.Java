class Giro extends Rekening {
    private double limitPenarikan;

    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
        } else {
            System.out.println("Melebihi limit penarikan!");
        }
    }
}