package Comparable;

//Comparable, Comparator two interfaces that helps us to sort things while using
//java collection algorithm to sorting things, we only need to implement the logic,
// what is bigger than what, person one or person two ?

//start from Comparable
//Example: we want to sort a list of people
// but how ? who is bigger than whom ?
//so we're going to sort them by their achieve in sports.

public class Person implements Comparable<Person> {
    private int age;
    private String field;
    private int placeInTheRace;

    public Person(int age, String field, int placeInTheRace) {
        this.age = age;
        this.field = field;
        this.placeInTheRace = placeInTheRace;
    }

    //we must have a getter to get the information.
    public int getPlaceInTheRace() {
        return placeInTheRace;
    }

    @Override
    public int compareTo(Person o) {
        if (this.placeInTheRace < o.placeInTheRace) {
            //return negative -> the smallest item is going be first one
            return -1;
        } else {
            return 1; // return positive -> the biggest item is going be last one
        }
    }

    @Override
    public String toString() {
        return "Comparable.Person{" +
                "age=" + age +
                ", field='" + field + '\'' +
                ", placeInTheRace=" + placeInTheRace +
                '}';
    }
}


