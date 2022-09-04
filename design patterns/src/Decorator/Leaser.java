package Decorator;

//the leasr attechment extand from attechment, no members
public class Leaser extends Attechment {

    //calling the super method again.
    Leaser(Gun gun) {
        super(10, gun);
    }

}


