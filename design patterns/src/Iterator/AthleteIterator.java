package Iterator;

import java.util.Iterator;

/**
 * Iterator.AthleteIterator, this class is creating an iterator for the athlete class.
 */
public class AthleteIterator implements Iterator {
    private int age;
    private String name;
    private int high;
    private int power;
    private int index;

    public AthleteIterator(int age, String name, int high, int power) {
        this.age = age;
        this.high = high;
        this.name = name;
        this.power = power;
        index = 0;
    }

    /**
     * hasNext, ask if there is any next item we want to check.
     * @return true if there is a next item. or false if it is the last item.
     */
    @Override
    public boolean hasNext() {
        if (index == 4) {
            return false;
        }
        return true;
    }

    /**
     * next function will move to the next item.
     * @return the item we want to do things on him in the for each loop.
     */
    @Override
    public Object next() {
        index++;
        if (index == 1) {
            return age;
        }
        if (index == 2) {
            return high;
        }
        if (index == 3) {
            return name;
        }
        return power;
    }
}





