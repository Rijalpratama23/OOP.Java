public interface Laptop {
    // Atribut dalam interface (harus bersifat final & static)
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    int DEFAULT_VOLUME = 50;

    // Metode yang harus diimplementasikan oleh kelas yang menggunakannya
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
