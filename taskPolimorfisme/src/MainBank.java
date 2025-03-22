import java.util.ArrayList;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        ArrayList<Bank> daftarBank = new ArrayList<>();

        // Menambahkan objek dari subclass yang berbeda (polimorfisme)
        daftarBank.add(new BankBCA());
        daftarBank.add(new BankBni());

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("\n=== Menu Bank ===");
            System.out.println("1. Transfer Uang");
            System.out.println("2. Informasi Bank");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah transfer: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan rekening tujuan: ");
                    String rekeningTujuan = scanner.nextLine();

                    System.out.println("\nPilih bank tujuan:");
                    System.out.println("1. Bank BCA");
                    System.out.println("2. Bank BNI");
                    System.out.print("Pilihan: ");
                    int bankPilihan = scanner.nextInt();
                    scanner.nextLine();

                    if (bankPilihan == 1) {
                        daftarBank.get(0).transferUang(jumlah, rekeningTujuan, "BCA");
                    } else if (bankPilihan == 2) {
                        daftarBank.get(1).transferUang(jumlah, rekeningTujuan, "BNI");
                    } else {
                        System.out.println("Pilihan bank tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== Informasi Bank ===");
                    for (Bank bank : daftarBank) {
                        bank.infoBank();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan bank kami!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}