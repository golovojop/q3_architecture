package products;

import interfaces.HardwareProduct;

public class FiberCard implements HardwareProduct {

    private final String vendor;
    private final String pn;

    public FiberCard(String vendor, String pn) {
        this.vendor = vendor;
        this.pn = pn;
    }

    @Override
    public void writeData(byte[] data) {
    }

    @Override
    public byte[] readData() {
        return new byte[] {10, 20, 30};
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
        return "FiberCard{" +
                "vendor='" + vendor + '\'' +
                ", pn='" + pn + '\'' +
                '}';
    }
}