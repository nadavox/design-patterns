package Iterator;

import java.util.Iterator;

public class Athlete implements Iterable {
    private int age;
    private String name;
    private int high;
    private int power;

    Athlete(int age, String name, int high, int power) {
        this.age = age;
        this.high = high;
        this.name = name;
        this.power = power;
    }

    @Override
    public Iterator iterator() {
        return new AthleteIterator(age,name,high,power);
    }

    //you must return the type of iterator
    //so in this example you are going to return Iteratot<T>
    //we want to be able to do for each in a list of Iterator.Athlete.
    //fun fact: you can do it class inside a class.
}





