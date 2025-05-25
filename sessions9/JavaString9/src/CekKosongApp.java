import java.util.Scanner;

// Kelas utama
public class CekKosongApp {
    public static void main(String[] args) {
        InputHandler handler = new InputHandler();
        handler.mintaDanPeriksaInput();

        // Contoh penggunaan getter:
        String hasilInput = handler.getKalimat();
        System.out.println("Isi kalimat yang disimpan: " + hasilInput);

    }
}

// Kelas untuk menangani input dan pengecekan
class InputHandler {
    private Scanner scanner = new Scanner(System.in);
    private String kalimat; // Tambahkan variabel kalimat sebagai atribut

    public void mintaDanPeriksaInput() {
        System.out.print("Masukkan sesuatu: ");
        kalimat = scanner.nextLine();

        if (kalimat.isEmpty()) {
            System.out.println("Kamu belum mengetik apa-apa!");
        } else {
            System.out.println("Terima kasih! Kamu mengetik: " + kalimat);
        }
    }

    // Getter untuk kalimat
    public String getKalimat() {
        return kalimat;
    }

    // Setter untuk kalimat
    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }
}
