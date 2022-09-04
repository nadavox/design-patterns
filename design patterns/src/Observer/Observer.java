package Observer;

import java.util.ArrayList;
import java.util.List;
//we're going to use Observer.Observer when we want to alert a group of members about
// some events that happening, and they sign up for receive notification.
//sometimes we can update the listeners and give them some data

//Example: an app that tell the customer when a flight take off and receive a message.
//when a flight taken off.

public class Observer {
    public static void main(String[] args) {
        //first create a monitor
        Monitor monitor = new Monitor();
        //create a list of customers.
        List<Customer> customerList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            customerList.add(new Customer());
        }
        //now we goona put only part of the
        //customers in the listners list
        for (int i = 0; i < 10; i++) {
            monitor.register(customerList.get(i));
        }

        monitor.unregister(customerList.get(15));

        ///flight number 5235 has taken off.
        monitor.notifyAll(5235);
        //as you can see only 10 customers get alert because only
        //ten customers register.

    }
}
