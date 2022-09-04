package AbstractFactory;


/**
 * The manager factory is independent of the other factories.
 *  He has an instance of the abstract factory interface.
 *  The manager factory can produce any product from any factory according to the costumer demands.
 */
public class ManagerFactory {
    private FactoryAbstract factory;

    //two option for constructor:
    //1. you give a number and than get a
    //object
    //2. you get a object and create the
    //object you give.

    /**
     * A constructor that creates a factory according to the costumer demands.
     * 1 for Apple
     * 2 for Windows
     * 3 for Dell
     * @param x the number
     */
    ManagerFactory(int x) {
        if (x == 1) {
           this.factory = new AppleFactory();
        }
        if (x == 2) {
            this.factory = new WindowsFactory();
        }
        if (x == 3){
            factory = new DellFactory();
        }
    }

    /**
     * A constructor that creates a factory according to the costumer.
     * @param factory the factory the costumer decided
     */
    ManagerFactory(FactoryAbstract factory) {
        this.factory = factory;
    }

    public Computer getcomputer() {
        return factory.createComputer();
    }

    public OperatingSystem getSystem() {
        return factory.createSystemOprition();
    }
}

