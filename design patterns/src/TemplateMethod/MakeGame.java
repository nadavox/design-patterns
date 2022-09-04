package TemplateMethod;
import java.util.List;

/**
 * our abstract class going to be make game, there is a several step in every game that you
 * have to commit to make a game. like: create levels, create enemy.
 */
abstract class MakeGame {
    protected List<Integer> levels;
    /**
     * the template method
     */
    public void makeGame() {
        levels = makelevels();
        makeMonster();
        //and can be more methods.
    }

    //abstract method so we can override.
    abstract public List<Integer> makelevels();

    //make monster method so every game start with this implementation,
    //and we can add more in the uniq subclasses
    public void makeMonster() {
        System.out.println("create monster");
    }
}


