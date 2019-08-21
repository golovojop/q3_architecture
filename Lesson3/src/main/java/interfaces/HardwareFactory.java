package interfaces;

public interface HardwareFactory {
    HardwareProduct createEthernetCard();
    HardwareProduct createFiberCard();
    HardwareProduct createWifiCard();
}
