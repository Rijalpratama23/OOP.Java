public abstract class Computer implements Laptop {
    protected int volume;

    public Computer() {
        this.volume = 50; // Default volume
    }

    public void volumeUp() {
        if (volume < 100) {
            volume += 10;
            System.out.println("Volume naik menjadi: " + volume);
        } else {
            System.out.println("Volume sudah maksimum!");
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume -= 10;
            System.out.println("Volume turun menjadi: " + volume);
        } else {
            System.out.println("Volume sudah minimum!");
        }
    }
}
