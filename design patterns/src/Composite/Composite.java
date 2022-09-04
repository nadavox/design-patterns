package Composite;//we are going to use Composite.Composite pattern when we have tree like object structure.
//like in army, chief commander -> commander -> solider -> and more.
//the idea is that every one going to use the same interface.
//only the root of the tree going to implement the interface
// and the others gonna inheritance from other classes.
//there is two kind of classes:
//1. the component classes, there are several classes like this. and they can extend each other.
//2. the composite classes, can be several classes like this, and they have an instant of list of their children.
// they are delegated their work to their children.


import java.util.ArrayList;
import java.util.List;


public class Composite {
    public static void main(String[] args) {
        Solider nadav = new RegularSolider(22,  "nadav" );
        Solider niv = new RegularSolider(22,  "niv" );
        Solider or = new RegularSolider(22,  "or" );
        Commander nadavNadav = new Commander(42, "king");
        nadavNadav.addRegularSoliders(nadav);
        nadavNadav.addRegularSoliders(niv);
        nadavNadav.addRegularSoliders(or);
        nadavNadav.clean();


    }
}
