import java.util.Scanner;

// Kelas utama
public class HitungVokalApp {
    public static void main(String[] args) {
        PenghitungVokal penghitung = new PenghitungVokal(); // Membuat objek
        penghitung.hitung(); // Memanggil method untuk menjalankan program
    }
}

// Kelas untuk menghitung vokal
class PenghitungVokal {
    Scanner scanner = new Scanner(System.in); // Scanner untuk input

    // Method utama yang menjalankan proses
    public void hitung() {
        System.out.print("Masukkan Kata: ");
        String kata = scanner.nextLine(); // ubah ke huruf kecil

        int jumlah = 0;

        // Loop untuk memeriksa tiap huruf
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);

            // Jika huruf adalah vokal, tambah jumlah
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                jumlah++;
            }
        }

        System.out.println("Jumlah Huruf Vokal: " + jumlah + " " + "huruf");
    }
}
