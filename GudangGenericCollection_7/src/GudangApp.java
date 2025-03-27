import java.util.Scanner;

public class GudangApp {
    public static void main(String[] args) {
        Gudang<String> gudang = new Gudang<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU GUDANG ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tambah Stok");
            System.out.println("4. Tampilkan Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer input

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan stok awal: ");
                    int stok = sc.nextInt();
                    gudang.addItem(new Item<>(kode, nama, stok));
                    break;

                case 2:
                    System.out.print("Masukkan kode barang yang akan dihapus: ");
                    String kodeHapus = sc.nextLine();
                    gudang.removeItem(kodeHapus);
                    break;

                case 3:
                    System.out.print("Masukkan kode barang yang akan ditambah stok: ");
                    String kodeTambah = sc.nextLine();
                    System.out.print("Masukkan jumlah stok yang akan ditambah: ");
                    int jumlahTambah = sc.nextInt();
                    gudang.addStock(kodeTambah, jumlahTambah);
                    break;

                case 4:
                    System.out.println("=== DAFTAR BARANG DI GUDANG ===");
                    gudang.printItem();
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

    }
}
