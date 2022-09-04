package Decorator;

/**
 * pistol a king of gun.
 */
public class pistol extends Gun {

    pistol() {
        super(10);
    }

    @Override
    public void shoot() {
        System.out.println("peo peo peo");
    }
}



