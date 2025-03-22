public class MacBook extends Computer {
    @Override
    public void powerOn() {
        System.out.println("MacBook menyala dengan logo Apple...");
    }

    @Override
    public void powerOff() {
        System.out.println("MacBook dimatikan...");
    }
}
