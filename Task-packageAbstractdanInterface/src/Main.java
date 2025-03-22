import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop;

        System.out.println("Pilih laptop: ");
        System.out.println("1. Toshiba");
        System.out.println("2. MacBook");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (choice == 1) {
            laptop = new Toshiba();
        } else if (choice == 2) {
            laptop = new MacBook();
        } else {
            System.out.println("Pilihan tidak valid.");
            scanner.close();
            return;
        }

        String command;
        do {
            System.out.println("\nMenu:");
            System.out.println("[ON] - Nyalakan Laptop");
            System.out.println("[OFF] - Matikan Laptop");
            System.out.println("[UP] - Volume Naik");
            System.out.println("[DOWN] - Volume Turun");
            System.out.println("[EXIT] - Keluar");
            System.out.print("Masukkan perintah: ");
            command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    laptop.powerOn();
                    break;
                case "OFF":
                    laptop.powerOff();
                    break;
                case "UP":
                    laptop.volumeUp();
                    break;
                case "DOWN":
                    laptop.volumeDown();
                    break;
                case "EXIT":
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Perintah tidak dikenal.");
            }
        } while (!command.equals("EXIT"));

        scanner.close();
    }
}
