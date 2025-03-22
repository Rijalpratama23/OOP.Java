
class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }
    
    public void setor(double jumlah, boolean transfer) {
        saldo += transfer ? jumlah - 2500 : jumlah;
    }
    
    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }
    
    public void tampilkanInfo() {
        System.out.println("Pemilik: " + namaPemilik + ", Rekening: " + nomorRekening + ", Saldo: " + saldo);
    }
}