package Observer;

import java.util.ArrayList;

/**
 * this class contain the list of listeners. we update them, add them, remove them.
 * we are doing everything that relate to the listeners from this class
 */
public class Monitor {
    ArrayList<Listeners> listenrs ;

    Monitor() {
        listenrs = new ArrayList<>();
    }

    public void register(Listeners listenr) {
        listenrs.add(listenr);
    }
    public void unregister(Listeners listenr) {
        listenrs.remove(listenr);
    }

    public void notifyAll(int data) {
        for (Listeners listenr : listenrs) {
            listenr.update(data);
        }
    }
}


