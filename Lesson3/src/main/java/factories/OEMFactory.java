package factories;

import interfaces.HardwareFactory;
import interfaces.HardwareProduct;
import products.EthernetCard;
import products.FiberCard;
import products.WifiCard;

public class OEMFactory implements HardwareFactory {

    private long partNumber = 1000000;
    private final int id;

    public OEMFactory(int id) {
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
        return OEMFactory.class.getSimpleName() + ":" + id;
    }
}
