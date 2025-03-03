import java.util.Scanner;

public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("\n===== Data Perhitungan Bangun Datar =====");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        System.out.print("Pilih bangun datar yang ingin dihitung (1-3): ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            // Bujur Sangkar
            System.out.print("Masukkan sisi Bujur Sangkar: ");
            double sisi = sc.nextDouble();
            BujurSangkar bujurSangkar = new BujurSangkar(sisi);
            System.out.println("\n" + bujurSangkar.getNama() + " - Luas: " + bujurSangkar.hitungLuas() + ", Keliling: " + bujurSangkar.hitungKeliling());

        } else if (pilihan == 2) {
            // Segitiga
            System.out.print("Masukkan alas Segitiga: ");
            double alas = sc.nextDouble();
            System.out.print("Masukkan tinggi Segitiga: ");
            double tinggi = sc.nextDouble();
            System.out.print("Masukkan sisi A Segitiga: ");
            double sisiA = sc.nextDouble();
            System.out.print("Masukkan sisi B Segitiga: ");
            double sisiB = sc.nextDouble();
            System.out.print("Masukkan sisi C Segitiga: ");
            double sisiC = sc.nextDouble();
            Segitiga segiTiga = new Segitiga(alas, tinggi, sisiA, sisiB, sisiC);
            System.out.println("\n" + segiTiga.getNama() + " - Luas: " + segiTiga.hitungLuas() + ", Keliling: " + segiTiga.hitungKeliling());

        } else if (pilihan == 3) {
            // Persegi Panjang
            System.out.print("Masukkan panjang Persegi Panjang: ");
            double panjang = sc.nextDouble();
            System.out.print("Masukkan lebar Persegi Panjang: ");
            double lebar = sc.nextDouble();
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
            System.out.println("\n" + persegiPanjang.getNama() + " - Luas: " + persegiPanjang.hitungLuas() + ", Keliling: " + persegiPanjang.hitungKeliling());

        } else {
            System.out.println("Pilihan tidak valid! Silakan jalankan ulang program dan pilih angka 1-3.");
        }

        sc.close(); // Menutup scanner untuk menghindari kebocoran sumber daya
    }
}
