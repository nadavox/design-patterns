package Iterable;

// we are aoing to use iterable interface when we want to be able to iterate
// with for each loop.

//so lets take example with sum class

public class _Iterable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Range range = new Range(a, b);
        //now it is printing all the number between 10 and 20.
        for (int number : range) {
            System.out.println(number);
        }
    }
}