package Decorator;//We are going to use the decorator design pattern when we have a number of items that can be "upgraded"
//Like in a game when you get more money, and then you can upgrade your main character.
//By using an abstract class and extending it, we will define methods that will be common between all the items.
//The abstract class has a member of the interface while the other classes will not have any members.
//We are going to use the super's constructor and when we will calculate the price, strength etc.
//we are going to call super.nameMethod + myself.


public class Decorator {
    public static void main(String[] args) {
        Gun gun = new pistol();
        System.out.println("the price of pistol: " + gun.getPrice());
        Attechment leaser = new Leaser(gun);
        System.out.println("the price of pistol + laser: " + leaser.getPrice());
        Attechment stack = new Stack(leaser);
        System.out.println("the price of pistol + laser + stack: " + stack.getPrice());
        Gun stackGun = new Stack(new M16());
        System.out.println("the kind of shooting:");
        gun.shoot();
        leaser.shoot();
        stack.shoot();
        stackGun.shoot();


    }
}