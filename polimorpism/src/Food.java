public class Food extends Product {
    String expire;

    public Food(String name, double price, String expire) {
        super(name, price);
        this.expire = expire;
    }

    public String getExpire() {
        return expire;
    }
    // pemanggilan getExpire
    public void setExpire(String expire) {
        this.expire = expire;
    }

    @Override
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Expire :" + getExpire());
    }
}
