package bridge;

import bridge.components.AutomaticGear;
import bridge.components.ManualGear;
import bridge.vehicle.Car;
import bridge.vehicle.Truck;
import bridge.vehicle.Vehicle;

public class BridgeApp {

    public static void main(String[] args) {

        ManualGear manualGear = new ManualGear();
        AutomaticGear automaticGear = new AutomaticGear();

        Vehicle car = new Car(manualGear);
        car.shiftGear();
        car = new Car(automaticGear);
        car.shiftGear();

        Vehicle truck = new Truck(manualGear);
        truck.shiftGear();
        truck = new Truck(automaticGear);
        truck.shiftGear();
    }
}
