import java.util.ArrayList;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        ArrayList<Rekening> daftarRekening = new ArrayList<>();
        
        // Menambahkan beberapa rekening
        Tabungan t1 = new Tabungan("Alice", "12345", 5000000, 5);
        Giro g1 = new Giro("Bob", "67890", 3000000, 1000000);
        Deposito d1 = new Deposito("Charlie", "54321", 10000000, 12, 7);
        
        daftarRekening.add(t1);
        daftarRekening.add(g1);
        daftarRekening.add(d1);

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do {
            // Menampilkan menu
            System.out.println("\n=== Menu Bank ===");
            System.out.println("1. Cek Semua Rekening");
            System.out.println("2. Cek Rekening Tabungan");
            System.out.println("3. Cek Rekening Giro");
            System.out.println("4. Cek Rekening Deposito");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            
            // Menangani input agar tidak error
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer

                switch (pilihan) {
                    case 1:
                        System.out.println("\n=== Semua Rekening ===");
                        for (Rekening r : daftarRekening) {
                            r.tampilkanInfo();
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("\n=== Rekening Tabungan ===");
                        for (Rekening r : daftarRekening) {
                            if (r instanceof Tabungan) {
                                r.tampilkanInfo();
                                System.out.println();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\n=== Rekening Giro ===");
                        for (Rekening r : daftarRekening) {
                            if (r instanceof Giro) {
                                r.tampilkanInfo();
                                System.out.println();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\n=== Rekening Deposito ===");
                        for (Rekening r : daftarRekening) {
                            if (r instanceof Deposito) {
                                r.tampilkanInfo();
                                System.out.println();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan layanan bank kami!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka sesuai pilihan.");
                scanner.nextLine(); // Membersihkan buffer untuk input berikutnya
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
