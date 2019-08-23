package bridge.vehicle;

import bridge.components.Gear;

public class Truck extends Vehicle {
    public Truck(Gear gear) {
        super(gear);
    }

    @Override
    public void shiftGear() {
        System.out.print("Truck shifts ");
        gear.changeGear();
    }
}
