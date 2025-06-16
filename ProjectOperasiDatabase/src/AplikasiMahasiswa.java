import java.util.InputMismatchException;
import java.util.Scanner;

public class AplikasiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataBaseMahasiswa db = new DataBaseMahasiswa();
        boolean exit = false;

        // Loop utama program: akan terus berjalan selama 'exit' adalah false
        while (!exit) {
            // Tampilkan menu pilihan kepada pengguna
            System.out.println("\n===== Operasi Database Mahasiswa Sederhana =====");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Input Data Mahasiswa Baru");
            System.out.println("3. Cari Data Mahasiswa");
            System.out.println("4. Ubah Data Mahasiswa");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar Program");
            System.out.print("Pilih menu (1-6): ");

            try {
                int pilihan = sc.nextInt();
                sc.nextLine();


                switch (pilihan) {
                    case 1:
                        db.tampilkanData(); 
                        break; 
                        db.inputData(sc); 
                    case 3:
                        db.cariData(sc);
                        break;
                    case 4:
                        db.ubahData(sc); 
                        break;
                    case 5:
                        db.hapusData(sc); 
                    case 6:
                        exit = true; 
                        System.out.println("Terima kasih! Program selesai.");
                        break;
                    default:
                        // Jika pilihan tidak ada di 1-6
                        System.out.println("Pilihan tidak valid. Silakan masukkan angka 1 sampai 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input menu tidak valid. Harap masukkan angka.");
                sc.nextLine(); 
            }
        }
        sc.close();
    }
}