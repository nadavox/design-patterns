package AbstractFactory;

/**
 * Product that will be made by the factories.
 */
public class Computer {
   private int screen;
   private int ram;

   Computer(int screen, int ram) {
       this.ram = ram;
       this.screen = screen;
   }

    public int getRam() {
        return ram;
    }

    public int getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return "AbstractFactory.Computer{" +
                "screen=" + screen +
                ", ram=" + ram +
                '}';
    }
}

