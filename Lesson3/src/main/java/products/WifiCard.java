package products;

import interfaces.HardwareProduct;

public class WifiCard implements HardwareProduct {

    private final String vendor;
    private final String pn;

    public WifiCard(String vendor, String pn) {
        this.vendor = vendor;
        this.pn = pn;
    }

    @Override
    public void writeData(byte[] data) {
    }

    @Override
    public byte[] readData() {
        return new byte[] {101, 102, 103};
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
        return "WifiCard{" +
                "vendor='" + vendor + '\'' +
                ", pn='" + pn + '\'' +
                '}';
    }
}
