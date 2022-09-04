package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable, Comparator two interfaces that helps us to sort things while using
//java collection algorithm to sorting things, we only need to implement the logic,
// what is bigger than what, person one or person two ?

//start from Comparable
//Example: we want to sort a list of people
// but how ? who is bigger than whom ?
//so we're going to sort them by their achieve in sports.


public class _Comparable {
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
        Collections.sort(list);


        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
