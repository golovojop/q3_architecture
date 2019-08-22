import factories.HardwareManufacturer;
import interfaces.HardwareFactory;


public class FabricPatternApp {
    public static void main(String[] args) {
        HardwareManufacturer hm = new HardwareManufacturer();

        HardwareFactory hwfChina = hm.createFactory("china");
        HardwareFactory hwfOem = hm.createFactory("");

        System.out.println(hwfChina.createEthernetCard());
        System.out.println(hwfOem.createFiberCard());
        System.out.println(hwfOem.createEthernetCard());
    }
}
