package interfaces;

public interface HardwareProduct {
    void writeData(byte[] data);
    byte[] readData();
    String getVendorName();
    String getPartNumber();
}
