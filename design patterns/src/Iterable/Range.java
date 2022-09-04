package Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * get two int numbers, and we can go through all the numbers between these two.
 */
public class Range implements Iterable<Integer> {
    private List<Integer> numbers ;

    Range(int start, int end) {
        numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
    }

    /**
     * Iterator, use the iterator of the list numbers.
     * @return the iterator of the list numbers.
     */
    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}

