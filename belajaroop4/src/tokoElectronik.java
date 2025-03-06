import java.util.Scanner;

public class tokoElectronik{
    public static void main(String[] args) {
        Electronic elc = new Electronic("iphone", 200.000, 10);
        Clothing clot = new Clothing(null, 0, 0, null);
        Food food = new Food(null, 0, null);

        Scanner sc = new Scanner(System.in);
        System.out.println("=========== Pilih Jenis Product =========");
        System.out.println("1. Laptop");
        System.out.println("2. Jacket");
        System.out.println("3. Seblak");
        System.out.print("Pilih jenis Product (1-3): ");
        // menu pilihan
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Merk :");
            String name = sc.nextLine();
            elc.setName(name);
            elc.infoProduct();
        }else if (pilihan == 2) {

        }else if(pilihan == 3) {

        }else {
            System.out.println("Pilihan Anda Invalid");
        }
    }   
}
    

