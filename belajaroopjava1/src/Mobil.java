// membuat class mobil
public class Mobil {
    // atribut
    String merk;
    String warna;
    int kecepatan;
    Boolean isTurnedOn = false;

    // METHOD
    // SET (pemanggilan)
    public void setDataMobil(String b, String warna, int k) {
        merk = b;
        kecepatan = k;
        this.warna = warna;
    }
    // GET (pengambilan)
    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Print (output)
    public void infoMobil() {
        System.out.println("Merk Mobil " + getMerk());
        System.out.println("Warna Mobil " + getWarna());
        System.out.println("Kecepatan " + getKecepatan());
        System.out.println("===================");
    }

    public void MobilInfo(int k) {
        if (isTurnedOn == true) {
            kecepatan += k;
        }else {
            System.out.println("Mobil dalam Keadaan Mati");
        }
    } 

    public void TurnOnMobil(Boolean True) {
        isTurnedOn = True;
    }

    public void TurnOffMobil(Boolean False) {
        isTurnedOn = False;
    }
}
