package AbstractFactory;


/**
 * Product that will be made by the factories.
 */
public class OperatingSystem {
    private int version;

    OperatingSystem(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }
}



