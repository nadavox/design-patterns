package Decorator;


//the real item class
public class M16 extends Gun {

    M16(){
        super(20);
    }

    @Override
    public void shoot() {
        System.out.println("peopeopeo");
    }
}


