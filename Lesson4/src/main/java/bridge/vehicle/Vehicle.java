package bridge.vehicle;

import bridge.components.Gear;

abstract public class Vehicle {
    protected Gear gear;

    public Vehicle(Gear gear) {
        this.gear = gear;
    }

    abstract public void shiftGear();
}

