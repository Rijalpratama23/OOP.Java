public class Segitiga extends BangunDatar {
    double alas, tinggi, sisiA, sisiB, sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    
    public double HitungLuas() {
        return 0.5 * alas * tinggi;  // Menghitung luas segitiga
    }

    
    public double HitungKeliling() {
        return sisiA + sisiB + sisiC;  // Menghitung keliling segitiga
    }
}
