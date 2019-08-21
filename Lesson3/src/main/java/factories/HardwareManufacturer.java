package factories;

import interfaces.HardwareFactory;

public class HardwareManufacturer {

    private int fabricId = 0;

    private final String CHINA_LOCATION = "CHINA";
    private final String TAIWAN_LOCATION = "TAIWAN";

    public HardwareFactory createFactory(String location) {

        HardwareFactory factory;
        switch (location.toUpperCase()) {
            case CHINA_LOCATION:
                factory = new ChinaFactory(++fabricId);
                break;
            case TAIWAN_LOCATION:
                factory = new TaiwanFactory(++fabricId);
                break;
            default:
                factory = new OEMFactory(++fabricId);
        }

        return factory;
    }
}
