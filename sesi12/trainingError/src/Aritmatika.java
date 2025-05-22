import java.util.InputMismatchException;
import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) throws Exception {
        System.out.println("========= Welcome ==========");
        Scanner sc = new Scanner(System.in);

        int hasil = 0;
        // penagnanan error menggunakan try
        try{
            
            System.out.println("angka 1: ");
            int num1 = sc.nextInt();
            System.out.println("angka 2: ");
            int num2 = sc.nextInt();
            hasil = num1 / num2;
        }catch(InputMismatchException ie){
            System.out.println(ie.getMessage());
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        finally{
            sc.close();
            System.out.println("Selalu dikerjakan");
        }

        // int hasil = num1 / num2;
        System.out.println("Hasil Pembagian : " + hasil);
    }

}
