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

/**
 * composite class number two why?
 * this class delegate their work to their children,
 * the list, every element is a child in the list.
 */
public class Commander extends Solider{
    private List<Solider> Soliders;

    Commander(int age, String name) {
        super(age, name);
        this.Soliders = new ArrayList<>();

    }

    public void addRegularSoliders(Solider c) {
        this.Soliders.add(c);
    }

    public void removeRegularSoliders(Solider c) {
        this.Soliders.remove(c);
    }

    @Override
    public void clean() {
        for (Solider commander : Soliders) {
            commander.clean();
        }
    }

    @Override
    public void shoot() {
        for (Solider commander : Soliders) {
            commander.shoot();
        }
    }
}


