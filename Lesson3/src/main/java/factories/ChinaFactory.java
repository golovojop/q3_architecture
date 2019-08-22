package factories;

import interfaces.HardwareFactory;
import interfaces.HardwareProduct;
import products.EthernetCard;
import products.FiberCard;
import products.WifiCard;

public class ChinaFactory implements HardwareFactory {

    private long partNumber = 0;
    private final int id;

    public ChinaFactory(int id) {
        this.id = id;
    }

    @Override
    public HardwareProduct createWifiCard() {
        return new WifiCard(vendorName(), Long.toString(++partNumber));
    }

    @Override
    public HardwareProduct createEthernetCard() {
        return new EthernetCard(vendorName(), Long.toString(++partNumber));
    }

    @Override
    public HardwareProduct createFiberCard() {
        return new FiberCard(vendorName(), Long.toString(++partNumber));
    }

    private String vendorName() {
        return ChinaFactory.class.getSimpleName() + ":" + id;
    }
}
