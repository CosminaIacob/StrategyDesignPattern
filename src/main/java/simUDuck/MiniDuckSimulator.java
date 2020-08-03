package simUDuck;

import simUDuck.ducks.Duck;
import simUDuck.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        // this calls the MallardDuck's inherited performQuack() methods,
        // which the delegates to object's QuackBehavior
        // (calls quack() on duck's inherited quackBehavior reference)
        mallard.performQuack();

        // same here
        mallard.performFly();
    }
}
