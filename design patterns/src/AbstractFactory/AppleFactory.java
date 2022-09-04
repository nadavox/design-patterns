package AbstractFactory;

/**
 * Apple factory.
 */
public class AppleFactory implements FactoryAbstract{

    @Override
    public Computer createComputer() {
        return new Computer(13, 8);
    }

    @Override
    public OperatingSystem createSystemOprition() {
        return new OperatingSystem(10);
    }
}

