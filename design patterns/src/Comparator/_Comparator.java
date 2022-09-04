package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//we are going to use Comparator when we don't have access to the class we want to sort
//so we create a Comparator class that helps us to sort.
// we are going to decide the logic how to sorting.

//Example: with person class we don't have permission to change it. imagine you import
// an external library.

import Comparable.Person;


public class _Comparator {
    public static void main(String[] args) {
        Person a = new Person(1, "a", 10);
        Person b = new Person(2, "b", 12);
        Person c = new Person(3, "c", 1);
        Person d = new Person(4, "d", 110);
        Person e = new Person(5, "e", 13);
        Person f = new Person(6, "f", 2);

        List<Person> list = new ArrayList<>();
        list.add(a);
        list.add(e);
        list.add(d);
        list.add(c);
        list.add(b);
        list.add(f);
        //now we need to use the other method for sorting
        //we send a Comparator class, so we can compare
        list.sort(new ComparatorPerson());
        //Collections.sort(list, new Comparator.ComparatorPerson());

        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
