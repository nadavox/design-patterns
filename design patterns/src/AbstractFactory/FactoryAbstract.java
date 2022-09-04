package AbstractFactory;


/**
 * The abstract factory interface.
 * Each factory will implement this interface.
 * By implementing this interface,
 * we can create the factories' products without creating dependency on the type
 */
interface FactoryAbstract {
    Computer createComputer();
    OperatingSystem createSystemOprition();
}

