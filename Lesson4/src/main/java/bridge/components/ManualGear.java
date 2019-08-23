package bridge.components;

public class ManualGear implements Gear {
    @Override
    public void changeGear() {
        System.out.println("Manual gear");
    }
}
