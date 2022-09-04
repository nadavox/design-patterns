package Composite;//we are going to use Composite.Composite pattern when we have tree like object structure.
//like in army, chief commander -> commander -> solider -> and more.
//the idea is that every one going to use the same interface.
//only the root of the tree going to implement the interface
// and the others gonna inheritance from other classes.
//there is two kind of classes:
//1. the component classes, there are several classes like this. and they can extend each other.
//2. the composite classes, can be several classes like this, and they have an instant of list of their children.
// they are delegated their work to their children.


/**
 * component class, the work they need to do they are doing, there is no one else.
 * they dont have any children
 * and they can extend other components, meaning no children class.
 */
public class RegularSolider extends Solider{

    RegularSolider(int age, String name) {
        super(age, name);
    }

    @Override
    public void clean() {
        System.out.println("yes sir, i am cleaning");
    }

    @Override
    public void shoot() {
        System.out.println("peo peo");
    }
}


