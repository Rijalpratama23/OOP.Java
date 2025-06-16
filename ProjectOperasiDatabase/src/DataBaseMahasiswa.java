import java.util.ArrayList;
import java.util.InputMismatchException; 
import java.util.Iterator;
import java.util.Scanner; 

public class DataBaseMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public DataBaseMahasiswa() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    // --- 1. Metode untuk Menampilkan Semua Data Mahasiswa ---
    public void tampilkanData() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Belum ada data mahasiswa yang tersimpan.");
            System.out.println("------------------------------------");
            return; // Keluar dari method jika kosong
        }

        System.out.println("------------------------------------");
        System.out.println("Daftar Data Mahasiswa:");
        System.out.println("------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs);
        }
        System.out.println("------------------------------------");
    }

    // --- 2. Metode untuk Menambahkan Data Mahasiswa Baru ---
    public void inputData(Scanner scanner) {
        System.out.println("------------------------------------");
        System.out.println("Input Data Mahasiswa Baru:");

        System.out.print("Masukkan NIM (contoh: 22001): ");
        String nim = scanner.nextLine();

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) { 
                System.out.println("Maaf, NIM " + nim + " sudah terdaftar. Input dibatalkan.");
                System.out.println("------------------------------------");
                return; 
            }
        }

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();

        int usia = 0;
        boolean inputUsiaValid = false;
        while (!inputUsiaValid) {
            try {
                System.out.print("Masukkan Usia (angka): ");
                usia = scanner.nextInt(); 
                if (usia <= 0) {
                    System.out.println("Usia harus berupa angka positif. Coba lagi.");
                } else {
                    inputUsiaValid = true; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah. Harap masukkan angka untuk usia.");
                scanner.next(); 
            } finally {
                scanner.nextLine();
            }
        }

        // Membuat objek Mahasiswa baru dengan data yang diinput
        Mahasiswa mahasiswaBaru = new Mahasiswa(nim, nama, jurusan, usia);
        daftarMahasiswa.add(mahasiswaBaru); // Menambahkan objek ke ArrayList
        System.out.println("Data mahasiswa berhasil ditambahkan.");
        System.out.println("------------------------------------");
    }

    // --- 3. Metode untuk Mencari Data Mahasiswa Berdasarkan NIM ---
    public void cariData(Scanner scanner) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Belum ada data mahasiswa untuk dicari.");
            System.out.println("------------------------------------");
            return;
        }

        System.out.println("------------------------------------");
        System.out.print("Masukkan NIM mahasiswa yang ingin dicari: ");
        String nimCari = scanner.nextLine();

        boolean ditemukan = false;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nimCari)) {
                System.out.println("Mahasiswa ditemukan:");
                System.out.println(mhs);
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
        System.out.println("------------------------------------");
    }

    // --- 4. Metode untuk Mengubah Data Mahasiswa Berdasarkan NIM ---
    public void ubahData(Scanner scanner) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Belum ada data mahasiswa untuk diubah.");
            System.out.println("------------------------------------");
            return;
        }

        System.out.println("------------------------------------");
        System.out.print("Masukkan NIM mahasiswa yang ingin diubah: ");
        String nimUbah = scanner.nextLine();

        boolean ditemukan = false;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nimUbah)) {
                System.out.println("Data mahasiswa yang akan diubah:");
                System.out.println(mhs);
                System.out.println("Masukkan data baru (kosongkan jika tidak ingin mengubah):");

                // Mengubah Nama
                System.out.print("Nama baru (" + mhs.getNama() + "): ");
                String namaBaru = scanner.nextLine();
                if (!namaBaru.isEmpty()) { 
                    mhs.setNama(namaBaru);
                }

                // Mengubah Jurusan
                System.out.print("Jurusan baru (" + mhs.getJurusan() + "): ");
                String jurusanBaru = scanner.nextLine();
                if (!jurusanBaru.isEmpty()) { 
                    mhs.setJurusan(jurusanBaru);
                }

                // Mengubah Usia
                int usiaBaru = mhs.getUsia(); 
                boolean inputUsiaValid = false;
                while (!inputUsiaValid) {
                    System.out.print("Usia baru (" + mhs.getUsia() + ", ketik 0 jika tidak ingin mengubah): ");
                    String usiaInput = scanner.nextLine();
                    if (usiaInput.isEmpty() || usiaInput.equals("0")) {
                        inputUsiaValid = true;
                    } else {
                        try {
                            int parsedUsia = Integer.parseInt(usiaInput);
                            if (parsedUsia <= 0) {
                                System.out.println("Usia harus lebih dari 0. Silakan coba lagi.");
                            } else {
                                usiaBaru = parsedUsia;
                                mhs.setUsia(usiaBaru); 
                                inputUsiaValid = true;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input usia tidak valid. Harap masukkan angka atau kosongkan.");
                        }
                    }
                }
                System.out.println("Data mahasiswa berhasil diubah.");
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimUbah + " tidak ditemukan.");
        }
        System.out.println("------------------------------------");
    }

    // --- 5. Metode untuk Menghapus Data Mahasiswa Berdasarkan NIM ---
    public void hapusData(Scanner scanner) {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Belum ada data mahasiswa untuk dihapus.");
            System.out.println("------------------------------------");
            return;
        }

        System.out.println("------------------------------------");
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nimHapus = scanner.nextLine();

        boolean ditemukan = false;
        Iterator<Mahasiswa> iterator = daftarMahasiswa.iterator();
        while (iterator.hasNext()) { // Selama masih ada elemen berikutnya
            Mahasiswa mhs = iterator.next(); // Ambil elemen berikutnya
            if (mhs.getNim().equals(nimHapus)) {
                iterator.remove(); // Hapus elemen saat ini
                System.out.println("Data mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                ditemukan = true;
                break; // Keluar dari loop setelah menghapus
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
        }
        System.out.println("------------------------------------");
    }
}