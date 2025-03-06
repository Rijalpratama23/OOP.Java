public class Clothing extends Product {
    int size;
    String material;

    public Clothing(String name, double price, int size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }

    // pemanggilan
    public void setSize(int size) {
        this.size = size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Size :" + getSize());
        System.out.println("Material :" + getMaterial());
    }
}
