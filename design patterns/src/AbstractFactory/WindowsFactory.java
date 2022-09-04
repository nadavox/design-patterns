package AbstractFactory;

/**
 * Windows factory.
 */
public class WindowsFactory implements FactoryAbstract{

    @Override
    public Computer createComputer() {
        return new Computer(15, 16);
    }

    @Override
    public OperatingSystem createSystemOprition() {
        return new OperatingSystem(11);
    }
}



