package bridge.vehicle;

import bridge.components.Gear;

public class Car extends Vehicle {
    public Car(Gear gear) {
        super(gear);
    }

    @Override
    public void shiftGear() {
        System.out.print("Car shifts ");
        gear.changeGear();
    }
}
