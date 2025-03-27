import  java.util.HashMap;
import java.util.Map;

public class Gudang <T> {
    Map<T, Item<T>> barang;

    public Gudang() {
        barang = new HashMap<>();
    }
    public void addItem(Item<T> item) {
        barang.put(item.getCode(),item);
        System.out.println(item.getName() + " " + "Berhasil di tambahkan!");
    }
    public void removeItem(T code) {
        if(barang.containsKey(code)){
            System.out.println(barang.get(code).getName()+" " + "Item berhasil di hapus!");
            barang.remove(code);
        }else {
            System.out.println(code + " " + "tidak ditemukan!");
        }
    }
    public void addStock(T code, int jumlah) {
        if(barang.containsKey(code)) {
            barang.get(code).addStock(jumlah);
            System.out.println("Stock" + " " + barang.get(code).getName()+ " "+ "Berhasil di tambahkan");
        }else {
            System.out.println("kode barang tidak di temukan!");
        }
    }
    public void removeStock(T code, int jumlah) {
        if(barang.containsKey(code)) {
            barang.get(code).removeStock(jumlah);
            System.out.println("Stock" + " " + barang.get(code).getName()+ " "+ "Berhasil di kurangi");
        }else {
            System.out.println("kode barang tidak di temukan!");
        }
    }
    

    public void printItem() {
        for(Item<T> item: barang.values()) {
            item.infoItem();
        }
    }
}
