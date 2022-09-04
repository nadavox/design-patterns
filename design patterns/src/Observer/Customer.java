package Observer;

/**
 * the coustomer class. it implements the Listeners interface, so they can listen to events.
 */
public class Customer implements Listeners {

    @Override
    public void update(int data) {
        System.out.println("flight number " + data + " has taken off");
    }
}


