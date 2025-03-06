// class dengan constructor
class Mahasiswa {
    String nama;
    String jurusan;

    // constructor tanpa parameter
    // public Mahasiswa() {
    //     System.out.println("ini adalah constructor");
    // }

    // contructor dengan parameter
    public Mahasiswa(String inputNama, String inputJurusaString) {
        nama = inputNama;
        jurusan = inputJurusaString;

        System.out.println(nama);
        System.out.println(jurusan);
    }

}


public class Main {
    public static void main(String[] args) throws Exception {
        // instansiasi object
        Mahasiswa mahasiswa1 = new Mahasiswa("doni","teknik informatika");
        
    }
}
