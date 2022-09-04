package Decorator;

/**
 * the abstract class of attechment, every attechment will extand this class
 */
abstract class Attechment extends Gun{
    private Gun gun;

    //it has a gun member and in the constructor we are
    //using the super method.
    Attechment(int price, Gun gun) {
        super(price);
        this.gun = gun;
    }

    //here we calculate the price of the gun
    ///with super and myself.
    @Override
    public int getPrice() {
        return super.getPrice() + gun.getPrice();
    }

    //here we shoot with the gun.
    @Override
    public void shoot() {
        gun.shoot();
    }


}


