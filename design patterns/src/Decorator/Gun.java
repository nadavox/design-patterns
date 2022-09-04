package Decorator;

/**
 * the abstract class gun, every gun extend this class.
 */
abstract class Gun {
    private int price;

    Gun(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    abstract public void shoot();
}

//we can call the real item class the basic item we start of it is like "naked" item.


