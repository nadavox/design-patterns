package Comparator;

import java.util.Comparator;
import Comparable.Person;

//we are going to use Comparator when we don't have access to the class we want to sort
//so we create a Comparator class that helps us to sort.
// we are going to decide the logic how to sorting.

//Example: with person class we don't have permission to change it. imagine you import
// an external library.

/**
 * Comparator.ComparatorPerson class it incharge of the logic of sortnig the
 * persons. it has a compare function that we are doing override
 * and decide who gonna "smaller" between two person.
 */
public class ComparatorPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPlaceInTheRace() < o2.getPlaceInTheRace()) {
            //return negative -> the smallest item is going be first one
            return -1;
        } else {
            return 1; // return positive -> the biggest item is going be last one
        }
    }
}


