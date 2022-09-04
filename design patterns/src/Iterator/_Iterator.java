package Iterator;

import java.util.Iterator;

//Iterator interface: we are going to use it when we want to make iterator for an object.
//in Iterator interface we create an iterator class, and we decide the logic how to iterate.
//it is good when we want to use for each.

//let's create iterator for athlete.
//usually you're going to use Iterator + Iterable.


public class _Iterator {
    public static void main(String[] args) {
        //create an Iterator.Athlete object.
        Athlete nadav = new Athlete(23, "nadav", 186, 100);
        //now for each on each member of Nadav.
        for (Object o : nadav) {
            System.out.println(o);
        }
    }
}
