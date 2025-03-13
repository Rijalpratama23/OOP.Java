public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;
    double jumlah;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public Rekening(String nama_pemilik, double saldo ){
        namaPemilik = nama_pemilik;
        this.saldo = saldo;
    }


    // get
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }
    public double getSaldo() {
        return saldo;
    }

    
    public double Setor(double jumlah, double saldo) {
        this.saldo = this.saldo + this.jumlah;
        return this.saldo;
    }
    public void Tarik(double jumlah) {
        if(jumlah >= saldo) {
            System.out.println('saldo tidak mencukupi');
        }else {
            
        }
        this.saldo - this.jumlah

    }
    public void tampilkanInfo(double jumlah) {
        System.out.println('Nama Pemilik :' + getNamaPemilik());
        System.out.println('Nomor Rekening :' + getNomorRekening());
        System.out.println('Saldo :' + getSaldo());
    }
        
}
