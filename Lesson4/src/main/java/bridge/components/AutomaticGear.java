package bridge.components;

public class AutomaticGear implements Gear {
    @Override
    public void changeGear() {
        System.out.println("Automatic gear");
    }
}
