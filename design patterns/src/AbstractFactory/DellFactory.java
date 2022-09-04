package AbstractFactory;


/**
 * Dell factory.
 */
public class DellFactory implements FactoryAbstract {

    @Override
    public Computer createComputer() {
        return new Computer(19, 32);
    }

    @Override
    public OperatingSystem createSystemOprition() {
        return new OperatingSystem(18);
    }
}

