package simUDuck.ducks;

import simUDuck.fly.impl.FlyWithWings;
import simUDuck.quack.impl.Quack;

public class MallardDuck extends Duck {

    // MallardDuck inherits the quackBehavior
    // and flyBehavior instance variables from class Duck
    public MallardDuck() {
        // a MallardDuck uses the Quack class to handle its quack,
        // so when performQuack() is called, the responsibility for the quack
        // is delegated to the Quack obj and we get a real quack
        quackBehavior = new Quack();

        // and it uses FlyWithWings as its FlyBehavior type
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
