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
 * interface tasks, tasks that solider need to do.
 */
interface Tasks {
    public void clean();
    public void shoot();
}


