package products;

import interfaces.HardwareProduct;

public class EthernetCard implements HardwareProduct {

    private final String vendor;
    private final String pn;

    public EthernetCard(String vendor, String pn) {
        this.vendor = vendor;
        this.pn = pn;
    }

    @Override
    public void writeData(byte[] data) {
    }

    @Override
    public byte[] readData() {
        return new byte[] {1, 2, 3};
    }

    @Override
    public String getVendorName() {
        return vendor;
    }

    @Override
    public String getPartNumber() {
        return pn;
    }

    @Override
    public String toString() {
        return "EthernetCard{" +
                "vendor='" + vendor + '\'' +
                ", pn='" + pn + '\'' +
                '}';
    }
}
