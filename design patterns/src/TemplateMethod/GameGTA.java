package TemplateMethod;
import java.util.ArrayList;
import java.util.List;

/**
 * concrete class that inheritance from the Instructions.
 * we don't import the template method. we're going to use the function from the abstract.
 * but other functions maybe yes. like, make levels method that act different from game to game.
 * and make monster method that use the basic logic and add monsters.
 */
public class GameGTA extends MakeGame {
    private int something;
    private int something1;
    private int something2;

    /**
     * constructor for this game can be anything
     */
    GameGTA() {
        something = 1;
        something1 = 2;
        something2 = 3;
    }

    //this method is uniq for this game.
    //so we override this method so when we use
    //the template method we gonna use this method.
    @Override
    public List<Integer> makelevels() {
        List<Integer> levels = new ArrayList<>();
        levels.add(1);
        levels.add(2);
        levels.add(3);

        return levels;
    }

    @Override
    public void makeMonster() {
        super.makeMonster();
        System.out.println("it is GTA");
    }
}


