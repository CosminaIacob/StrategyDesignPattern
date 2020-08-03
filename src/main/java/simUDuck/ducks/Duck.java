package simUDuck.ducks;


import simUDuck.fly.FlyBehavior;
import simUDuck.quack.QuackBehavior;

public abstract class Duck {

    // each Duck has a reference to sth
    // that implements the QuackBehavior interface
    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    // rather than handling the quack behavior itself,
    // the Duck object delegates that behavior
    // to the obj referenced by quackBehavior
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
