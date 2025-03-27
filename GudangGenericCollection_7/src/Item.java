public class Item <T> {
    T code;
    String name;
    int stock;

    //pemanggilan atribute item
    public Item(T code, String name, int stock) {
        this.code = code;
        this.name = name;
        this.stock = stock;
    }

    // set
    public void setCode(T code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // get
    public T getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }

    // tambahan metode
    public void addStock(int stock) {
        this.stock += stock;
        System.out.println(getName() + " " + "Berhasil di tambahkan!" + " " + "sebanyak: " + " " + stock + " " + "unit");
    }

    public void removeStock(int jumlah) {
        if(jumlah <= this.stock) {
            this.stock -= jumlah;
            System.out.println(getName() + " " + "Berhasil dikurangi" + " " + "Sebanyak" + jumlah + " " + "unit");
        }else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    public void infoItem() {
        System.out.println
        ("Kode: " + " " + getCode() + " " + "|Nama Barang" + " " + getName() + " " + "|Stock" + getStock() );
    }
}
