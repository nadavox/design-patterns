package TemplateMethod;//general idea:
// create a abstract class and create two types of methods:
//1. abstract method -> the subclass of this class must implement those methods
//2. template method -> the abstract class has implementation of those methods
//and this logic is good for all subclasses but the subclasses can add more functionally on top of
//the implementation of the abstract class.
//we do not override the template method.


public class TemplateMethod {
    public static void main(String[] args) {
        //create now GTA game.
        MakeGame GTA = new GameGTA();
        ///create a COD.
        MakeGame COD = new GameCOD();
        //make game method of each one of them.
        GTA.makeGame();
        COD.makeGame();

    }
}
